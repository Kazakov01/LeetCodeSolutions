package org.solutions.p1071;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        for (int i = 0; i < str2.length(); i++) {
            String div = str2.substring(0, str2.length() - i);
            if (strDivision(str1, div) != 0 && strDivision(str2, div) != 0) {
                return div;
            }
        }
        return "";
    }

    public int strDivision(String str, String div) {
        if (str.length() % div.length() != 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int j = i % div.length();
            if (str.charAt(i) != div.charAt(j)) {
                return 0;
            }
            if (j == 0) {
                res++;
            }
        }
        return res;
    }
}
