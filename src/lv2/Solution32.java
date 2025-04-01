package lv2;

public class Solution32 {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        answer = 0;
        for(int i =0; i< a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
