class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}

/*
Example 1:

Input:
s = "abab"

Output:
true


Example 2:

Input:
s = "aba"

Output:
false


Example 3:

Input:
s = "abcabcabcabc"

Output:
true
*/
