import java.util.*;

public class Main {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");

        for (List<String> group : result) {
            System.out.println(group);
        }

        sc.close();
    }
}

//output
Enter the number of strings: 6
Enter the strings:
eat
tea
tan
ate
nat
bat

Grouped Anagrams:
[eat, tea, ate]
[bat]
[tan, nat]
