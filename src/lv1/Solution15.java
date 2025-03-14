package lv1;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {
    public int solution(int n) {
        int answer = 0;
        List<Integer>minDivider = new ArrayList<>();
        for(int i = 1 ; i <n; i++){
            if(n % i == 1){
                minDivider.add(i);
            }
        }
        answer = minDivider.get(0);
        return answer;
    }
}
