package lv1;

import java.util.stream.LongStream;

public class Solution22 {
    public long solution(int a, int b) {
        long answer = 0;
        answer = LongStream.rangeClosed(Math.min(a,b), Math.max(a, b)).sum();
        return answer;
    }
}