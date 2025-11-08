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

        System.out.println(wordPattern(pattern8, s8));
    }

    public static boolean wordPattern(String pattern, String s){
        StringBuilder sb = new StringBuilder();
        Map<Character, String> map = new HashMap<>();
        int j = 0;
//
//        if(pattern.equals(s) && pattern.length()>1)
//            return false;

        for (int i = 0; i < s.length(); i++) {
            if (j == pattern.length())
                return false;
            if (s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else {
                if (!map.containsKey(pattern.charAt(j)) && map.containsValue(sb.toString()))
                    return false;

                if (map.get(pattern.charAt(j)) == null) {
                    map.put(pattern.charAt(j), sb.toString());
                    sb.delete(0, sb.length());
                    if (j < pattern.length() ) {
                        j++;
                    }
                    continue;
                }
                if (map.get(pattern.charAt(j)).equals(sb.toString())) {
                    sb.delete(0, sb.length());
                    if (j < pattern.length() ) {
                        j++;
                    }
                    continue;
                }
                if (!map.get(pattern.charAt(j)).equals(sb.toString())){
                    return false;
                }
            }
        }

        if (j == pattern.length()-1) {
            if (!map.containsKey(pattern.charAt(j)) && map.containsValue(sb.toString()))
                return false;

            if (map.get(pattern.charAt(j)) == null || map.get(pattern.charAt(j)).equals(sb.toString())) {
                return true;
            }
        }

        return false;
    }

}
