package org.solutions.p290WordPattern;

import java.util.HashMap;
import java.util.Map;

public class BadSolution {
    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat fish";

        String pattern2 = "abba";
        String s2 = "dog cat cat dog";

        String pattern3 = "abba";
        String s3 = "dog dog dog dog";

        String pattern4 = "a";
        String s4 = "a";

        String pattern5 = "abc";
        String s5 = "dog cat dog";

        String pattern6 = "aaa";
        String s6 = "aa aa aa aa";

        String pattern7 = "jquery";
        String s7 = "jquery";

        String pattern8 = "he";
        String s8 = "unit";

        System.out.println("1 " + wordPattern(pattern1, s1));
        System.out.println("2 " + wordPattern(pattern2, s2));
        System.out.println("3 " + wordPattern(pattern3, s3));
        System.out.println("4 " + wordPattern(pattern4, s4));
        System.out.println("5 " + wordPattern(pattern5, s5));
        System.out.println("6 " + wordPattern(pattern6, s6));
        System.out.println("7 " + wordPattern(pattern7, s7));
        System.out.println("8 " + wordPattern(pattern8, s8));
    }

    public static boolean wordPattern(String pattern, String s){
        StringBuilder sb = new StringBuilder();
        Map<String, Character> map = new HashMap<>();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else {
//                if (!map.containsKey(sb.toString()))
            }
        }
        return false;
    }

}
