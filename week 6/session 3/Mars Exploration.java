import java.io.*;

class Result {

    public static int marsExploration(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i % 3 == 0 && s.charAt(i) != 'S') {
                count++;
            }

            if (i % 3 == 1 && s.charAt(i) != 'O') {
                count++;
            }

            if (i % 3 == 2 && s.charAt(i) != 'S') {
                count++;
            }
        }

        return count;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw =
            new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = br.readLine();

        int result = Result.marsExploration(s);

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();
    }
}

//output:

SOSSPSSQSSOR
3

