import java.util.*;

public class Main {

    public static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Input:");
        System.out.println("haystack = \"" + haystack + "\"");
        System.out.println("needle = \"" + needle + "\"");

        System.out.println("Output:");
        System.out.println(result);
    }
}

/*
OUTPUT:

Input:
haystack = "sadbutsad"
needle = "sad"

Output:
0
*/
