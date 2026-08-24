import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Count frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        // Build result
        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.poll();

            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
  /OUTPUT:
  s = "tree"
  "eert"

  

}
