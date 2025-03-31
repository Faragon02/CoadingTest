package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution30 {
    public String solution(String s) {
        String answer = "";
        String[] stringArr = s.split("");
        if(s.length() % 2 ==0){
            List<String> stringList = new ArrayList<>();
            stringList.add(stringArr[stringArr.length /2 -1]);
            stringList.add(stringArr[stringArr.length /2]);
            answer =stringList.stream().map(String::new).collect(Collectors.joining());
        }else {
            answer = stringArr[stringArr.length /2 ];
        }
        return answer;
    }
}
