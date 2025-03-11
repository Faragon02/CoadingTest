package lv1;

public class Solution12 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr)
        {
            answer += i;
        }
        answer = answer / arr.length;
        return answer;
    }
}
