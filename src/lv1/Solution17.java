package lv1;

import java.util.List;
import java.util.ArrayList;

public class Solution17 {

    public int[] solution(long n) {
        int[] answer ={};
        List<Long> temp =new ArrayList<>();
        while(n!=0){
            temp.add(n % 10);
            n= n/10;
        }
        answer = temp.stream().mapToInt(Long::intValue).toArray();
        return answer;
    }
}
