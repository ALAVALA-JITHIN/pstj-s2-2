import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int[] left = new int[26];
            int[] right = new int[26];

            int n = s.length();
            int half = n / 2;

            // Count characters in left half
            for (int i = 0; i < half; i++) {
                left[s.charAt(i) - 'a']++;
            }

            // Count characters in right half
            for (int i = (n + 1) / 2; i < n; i++) {
                right[s.charAt(i) - 'a']++;
            }

            // Compare frequencies
            boolean isLapindrome = true;

            for (int i = 0; i < 26; i++) {
                if (left[i] != right[i]) {
                    isLapindrome = false;
                    break;
                }
            }

            if (isLapindrome) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
output:
gaga
Left  = "ga"
Right = "ga"
}
