package lv2;

import java.util.ArrayList;
import java.util.List;
public class Solution33 {
    public int solution(int left, int right) {
        int answer = 0;
        int getCount= 0;
       for(int i = left; i<= right; i++){
           for(int j = 1; j <=i; j++){
               if(i % j==0){
                   getCount++;
               }
           }
           if(getCount % 2 ==0){
               answer += i;

           }else {
               answer += -i;
           }
           getCount =0;
       }
        return answer;
    }
}
