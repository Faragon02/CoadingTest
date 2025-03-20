package lv1;

public class Solution19 {
    public long solution(long n) {
        long answer = 0;
       if(Math.sqrt(n)%1 ==0){
           answer = (long) Math.sqrt(n);
           answer = (answer + 1) * (answer + 1);
       }else{
           answer = -1;
       }

        return answer;
    }


    public long solution1(long n) {
        long answer = 0;
        if(Math.pow(Math.sqrt(n) ,2) == n){
            answer =(long) Math.pow(Math.sqrt(n) + 1 ,2);
        }else {
            answer = -1;
        }

        return answer;
    }

}
