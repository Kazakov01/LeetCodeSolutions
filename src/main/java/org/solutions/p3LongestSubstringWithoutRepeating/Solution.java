package org.solutions.p3LongestSubstringWithoutRepeating;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "pwp2p2pwke";
        String s3 = "";
        String s4 = "pwp2p2345pwke";

        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max;
        if (s.length() == 0) {
            return 0;
        } else {
            max = 1;
        }

        for (int i = 0; i != s.length(); i++){
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                if (map.size() > max) {
                    max = map.size();
                }
                i = map.get(s.charAt(i));
                map.clear();
            }
        }

        if (!map.containsKey(s.charAt(s.length()-1)))
            map.put(s.charAt(s.length() -1), s.length()-1);

        if (map.size() > max){
            max = map.size();
        }

        return max;
    }
}
