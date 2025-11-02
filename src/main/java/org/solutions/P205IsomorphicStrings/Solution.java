package org.solutions.P205IsomorphicStrings;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        String r = "bbbaaaba";
        String q = "aaabbbba";

        String x = "badc";
        String y = "baba";
        System.out.println(isIsomorphic(r, q));
    }

    public static boolean isIsomorphic(String s, String t){

        HashMap<Character, Character> res = new HashMap<>();

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int finalI = i;
//            res.computeIfAbsent(s.charAt(i), k -> t.charAt(finalI));

            if(!res.containsKey(s.charAt(i)) && !res.containsValue(t.charAt(i))){
                res.put(s.charAt(i), t.charAt(i));
            }
            a.append(res.get(s.charAt(i)));
        }
        System.out.println(a.toString());
        return t.equals(a.toString());
    }
}
