package lv1;

import java.util.Arrays;
import java.util.List;

public class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        for(int i =0; i< signs.length; i++){

            if(signs[i]!= true){
                absolutes[i] = absolutes[i] * -1;
            }
        }
        answer =  Arrays.stream(absolutes).sum();
        return answer;
    }
}
