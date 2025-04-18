package lv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerList =new ArrayList<>();
        for(int command = 0; command < commands.length; command++){
            List<Integer> tempList = new ArrayList<>();
            int  firstNum= commands[command][0] -1;
            int  lastNum= commands[command][1] -1;
            int  TargetNum= commands[command][2] -1 ;

            for(int getNum = firstNum; getNum <= lastNum; getNum++){
                tempList.add(array[getNum]);
            }
            Collections.sort(tempList);
            answerList.add(tempList.get(TargetNum));
        }
        return answer = answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}