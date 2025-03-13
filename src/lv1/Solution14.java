package lv1;

public class Solution14 {

    public int solution(int n) {
        int answer = 0;
        for(int i =0; i< n; i++)
        {
            answer +=i;
        }
        return answer;
    }

    public int Anothersolution(int n) {
        int answer = 0;
        answer = divisor(1, n, answer);
        return answer;
    }

    public int divisor(int startNum, int endNum, int returnValue){
        if(startNum > endNum) {
            return returnValue;
        }
        if(endNum % startNum == 0)
        {
            returnValue += startNum;
        }
        startNum ++;
        return divisor(startNum,  endNum, returnValue);
    }

}
