package org.solutions.p2103;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countPoints(String rings) {
        int res = 0;
        Node[] nodeArr = new Node[10];
        for(int i = 0; i < 10; i++) {
            nodeArr[i] = new Node();
        }
        for(int i = 1; i < rings.length(); i += 2 ) {
            char colour = rings.charAt(i-1);
            int idx = rings.charAt(i) - '0';
            if (colour == 'R') {
                nodeArr[idx].hasRed = true;
            }
            if (colour == 'G') {
                nodeArr[idx].hasGreen = true;
            }
            if (colour == 'B') {
                nodeArr[idx].hasBlue = true;
            }
        }

        for (int i = 0; i < nodeArr.length; i++) {
            if (nodeArr[i].hasAllColours()) {
                res++;
            }
        }
        return res;
    }

    public static class Node {
        boolean hasRed;
        boolean hasGreen;
        boolean hasBlue;


        private boolean hasAllColours () {
            return hasRed && hasGreen && hasBlue;
        }
    }


}
