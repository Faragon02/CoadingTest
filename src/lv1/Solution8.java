package lv1;

public class Solution8 {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90)
        {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        }
        else if(angle >90 && angle <180)
        {
            answer = 3;
        }
        else if( angle == 180)
        {
            answer =4;
        }
        else
        {
            answer = 0;
            System.out.println("삼각형이 아닙니다.");
        }
        return answer;
    }
}
