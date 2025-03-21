package lv1;

import java.util.ArrayList;
import java.util.List;

public class Solution21 {
    public boolean solution(int x) {
        boolean answer = true;
        List<Integer> addList = new ArrayList<>();
        int tempValue =x;
        while(tempValue>0){
            addList.add(tempValue % 10);
            tempValue = tempValue/10;
        }
        int hasyad = addList.stream().mapToInt(Integer::valueOf).sum();
        answer = (x % hasyad == 0)? true: false;
        return answer;
    }
}
