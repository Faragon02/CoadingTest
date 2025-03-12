package lv1;

public class Solution13 {

    public int solution(int n) {
        int answer = 0;

        for(int i=n; i>0; i= i/10)
        {
            answer =answer + (i % 10);
            System.out.println("n=" + i);
            System.out.println("나머지" + i % 10);

        }
        return answer;
    }
}
