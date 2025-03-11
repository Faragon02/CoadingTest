package lv1;

public class Solution3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num2 != 0){
            answer = Math.floorDiv(num1, num2);
        }
        else
        {
            throw  new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return answer;
    }
}
