import java.util.*;

public class Main {

    public static boolean rotateString(String s, String goal) {

        // If lengths are different, rotation is impossible
        if (s.length() != goal.length()) {
            return false;
        }

        // A rotation of s will be present inside s + s
        String combined = s + s;

        return combined.contains(goal);
    }

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean result = rotateString(s, goal);

        System.out.println(result);
    }
}

//output:

String s = "abcde";
String goal = "abced";


false
