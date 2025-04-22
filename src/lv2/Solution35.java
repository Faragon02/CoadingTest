package lv2;

public class Solution35 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        for(int i = 1; i<= count; i++) {
            totalPrice = (price *i);
        }
        answer = totalPrice - money;
        if(money > totalPrice){
            answer = 0;
        }
        return answer;
    }
}
