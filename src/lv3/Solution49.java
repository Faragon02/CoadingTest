package lv3;

import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.stream.Collectors;

public class Solution49 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> resultdata = new HashSet<>();
        for(int i =0 ; i< numbers.length; i++){
            for(int j = i +1; j<numbers.length; j++ ){
            resultdata.add(numbers[i] + numbers[j]);
            }
        }

        return answer = resultdata.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
