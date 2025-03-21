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

    public int[] solution(int[] n){
        int[] answer ;
        List<Integer> temp1;
        List<String> strAnswer = new ArrayList<>();
        for(int i : n){
            temp1 = new ArrayList<>();
            while (i > 0){
                temp1.add( i % 10);
                i = i / 10;
            }
            String s = temp1.stream().map(String::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
            strAnswer.add(s);
        }
        return  answer = strAnswer.stream().mapToInt(Integer::valueOf).toArray();
    }

    public  int solution(int n, int k){
        int count = 0;
        while (n > 0){
            if(n % 10 == k){
                count++;
            }
            n = n /10;
        }
        return  count;
    }

}

