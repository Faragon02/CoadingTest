package lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution20 {
    public long solution(long n) {
        long answer = 0;
        List<Long> temp1 = new ArrayList<>();
        while (n>0){
            temp1.add( n% 10);
            n= n/10;
        }
        String s = temp1.stream().map(String::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        answer =Long.parseLong(s);
        return answer;
    }
}
