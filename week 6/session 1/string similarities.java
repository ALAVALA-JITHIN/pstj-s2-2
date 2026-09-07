public static long stringSimilarity(String s) {

    long total = 0;

    for (int i = 0; i < s.length(); i++) {

        int j = 0;

        while (i + j < s.length()
                && s.charAt(j) == s.charAt(i + j)) {
            j++;
        }

        total += j;
    }

    return total;
}
//output:
Input:
ababaa

Output:
11
