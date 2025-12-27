package org.solutions.p3110ScoreOfAString;

public class Solution {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he";
        System.out.println(scoreOfString(s2));
    }

    public static int scoreOfString(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return res;
    }
}
