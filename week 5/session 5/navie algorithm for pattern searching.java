class NaivePatternSearch {
    public static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {

        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        search(text, pattern);
    }
}

//output:
Text:    A B A B A B C
Pattern: A B A

Check:
A B A → Match at index 0 
  B A B → No
    A B A → Match at index 2 
      B A B → No
        A B C → No

Output:
0 2
