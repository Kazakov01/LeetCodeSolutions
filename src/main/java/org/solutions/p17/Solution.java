package org.solutions.p17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> letterCombinations = new ArrayList<>();
        List<String> letterMapping = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < digits.length(); i++) {
            letterMapping.add(digitsMapping(digits.charAt(i)));
//            for (int j = 0; j < letterMapping.get(i).length(); j++) {
//                letterCombinations.add(String.valueOf(letterMapping.get(i).charAt(j)));
//            }
        }

        for (int i = 0; i < letterMapping.size(); i++) {
//            letterMapping.get(0).charAt()
        }
        return letterCombinations;
    }

    private String digitsMapping(char digit) {
        if (digit == '2') {
            return "abc";
        } else if (digit == '3') {
            return "def";
        } else if(digit == '4') {
            return "ghi";
        } else if(digit == '5') {
            return "jkl";
        } else if(digit == '6') {
            return "mno";
        } else if(digit == '7') {
            return "pqrs";
        } else if(digit == '8') {
            return "tuv";
        } else if(digit == '9') {
            return "wxyz";
        }
        throw new IllegalArgumentException ("Not a digit");
    }
}

class Example {
    public List<String> combination(List<String> list) {
        List<String> combinations = new ArrayList<>();
        combinations.add("");
        for (int i = 0; i < list.size(); i++) {
            List<String> tmp = new ArrayList<>();
            for (String s : combinations) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    String comb = s + list.get(i).charAt(j);
                    tmp.add(comb);
                }
            }
            combinations = tmp;
        }
        return combinations;
    }
}