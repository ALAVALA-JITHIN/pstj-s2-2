import java.io.*;
import java.util.*;

public class Solution {

    static int[] manacher(char[] s) {

        int n = s.length;
        int[] d1 = new int[n];

        // Odd length palindromes
        int l = 0, r = -1;

        for (int i = 0; i < n; i++) {

            int k = (i > r) ? 1 : Math.min(d1[l + r - i], r - i + 1);

            while (i - k >= 0 &&
                   i + k < n &&
                   s[i - k] == s[i + k]) {
                k++;
            }

            d1[i] = k--;

            if (i + k > r) {
                l = i - k;
                r = i + k;
            }
        }

        return d1;
    }

    static int[] manacherEven(char[] s) {

        int n = s.length;
        int[] d2 = new int[n];

        int l = 0, r = -1;

        // Even length palindromes
        for (int i = 0; i < n; i++) {

            int k = (i > r) ? 0 : Math.min(d2[l + r - i + 1], r - i + 1);

            while (i - k - 1 >= 0 &&
                   i + k < n &&
                   s[i - k - 1] == s[i + k]) {
                k++;
            }

            d2[i] = k--;

            if (i + k > r) {
                l = i - k - 1;
                r = i + k;
            }
        }

        return d2;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        String s = br.readLine().trim();

        // Create doubled string.
        // This allows us to represent every circular rotation.
        String doubled = s + s;

        char[] chars = doubled.toCharArray();

        int[] odd = manacher(chars);
        int[] even = manacherEven(chars);

        /*
         * For every starting position of a rotation,
         * find the longest palindrome that lies completely
         * inside the n characters of that rotation.
         *
         * This straightforward version checks every possible
         * center. It is intended for understanding the logic.
         */

        int[] answer = new int[n];

        for (int start = 0; start < n; start++) {

            int end = start + n - 1;

            int best = 1;

            // Odd length palindromes
            for (int center = start; center <= end; center++) {

                int radius = odd[center];

                int left = Math.max(center - radius + 1, start);
                int right = Math.min(center + radius - 1, end);

                int length = right - left + 1;

                if (length > best) {
                    best = length;
                }
            }

            // Even length palindromes
            for (int center = start; center <= end; center++) {

                int radius = even[center];

                if (radius == 0) {
                    continue;
                }

                int left = Math.max(center - radius, start);
                int right = Math.min(center + radius - 1, end);

                int length = right - left + 1;

                if (length > best) {
                    best = length;
                }
            }

            answer[start] = best;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
}


//output:


13
aaaaabbbbaaaa

12
12
10
8
8
9
11
13
11
9
8
8
10



//
