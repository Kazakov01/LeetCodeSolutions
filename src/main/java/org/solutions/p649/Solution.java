package org.solutions.p649;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String predictPartyVictory(String senate) {


        List<Character> senateArr = new ArrayList<>();
        int r = 0;
        int d = 0;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                r++;
            } else {
                d++;
            }
            senateArr.add(senate.charAt(i));
        }
        if (r > 2 * d + 1)
            return "Radiant";

        if (d > 2 * r + 1)
            return "Dire";

        while (true){
            for (int i = 0; i < senateArr.size(); i++){
                if (!vote(senateArr, i)){
                    return senateArr.get(i) == 'R' ? "Radiant" : "Dire";
                }
            }
        }
    }

    private boolean vote(List<Character> senateArr, int pos) {
        char ally = senateArr.get(pos);
        for (int i = pos + 1; i < senateArr.size(); i++) {
            if (senateArr.get(i) != ally) {
                senateArr.remove(i);
                System.out.println("remove" + i);
                return true;
            }
        }

        for (int i = 0; i < pos; i++) {
            if (senateArr.get(i) != ally){
                senateArr.remove(i);
                System.out.println("remove" + i);
                return true;
            }
        }
        return false;
    }
}
