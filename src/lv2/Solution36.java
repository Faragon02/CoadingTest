package lv2;

import java.util.regex.Pattern;

public class Solution36 {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() ==4 || s.length() ==6 ) {
            answer =s.matches("\\d+") ? true : false;
        }
        return answer;
    }
}
