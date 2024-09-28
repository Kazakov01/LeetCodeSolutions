package org.solutions.p392;

public class Solution {

    // s abc  t ascsbjc
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;

        if (t.length() < s.length() || t.length() == 0)
            return false;

        int j = 0;
        for (int i = 0; i < t.length(); i++){
            if (j == s.length())
                return true;
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                continue;
            }
        }

        if (j == s.length())
            return true;
        return false;
    }
}
