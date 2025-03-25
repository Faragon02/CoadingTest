package lv1;

import java.util.Arrays;

public class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        return answer.length > 0 ? answer : new int[]{-1};
    }
}
