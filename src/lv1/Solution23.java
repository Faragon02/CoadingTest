package lv1;

public class Solution23 {
    public int solution(int num) {
        int answer = 0;
        //int 형때문에 중간에 이상하게 계산됨.
        long value = Long.valueOf(num);
        //주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1
        if(value == 1){
            //주어진 수가 1인 경우에는 0
            return 0;
        }
        while (value != 1){
            //입력된 수가 짝수라면 2로 나눕니다.
            //입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
            value = (value % 2 == 0) ? value /2: (value * 3) +1;
            answer ++;
            if(answer >= 500){
                //결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
                answer =  -1;
                break;
            }
        }
        return answer;
    }
}
