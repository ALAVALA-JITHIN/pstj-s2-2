import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Count characters in p
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        // Sliding window
        for (int i = 0; i < s.length(); i++) {

            windowCount[s.charAt(i) - 'a']++;

            // Remove character outside the window
            if (i >= p.length()) {
                windowCount[s.charAt(i - p.length()) - 'a']--;
            }

            // Check whether current window is an anagram
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}


//output:
s = "cbaebabacd"
p = "abc"



  cba → anagram of abc → index 0 ✅
bae → no
aeb → no
eba → no
bab → no
aba → no
bac → anagram of abc → index 6 ✅
