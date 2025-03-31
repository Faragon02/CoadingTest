package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution29 {
    public int[] solution(int[] arr) {
        if (arr.length == 0 || arr[0] == 10) {
            return new int[]{-1};
        }
        int[]  answer = new int[arr.length -1];
        int minValue = Arrays.stream(arr).min().getAsInt();
        for(int i = 0; i< arr.length; i++ ){
            if( arr[i] !=minValue){
                answer[i] = arr[i];
            }
        }
        return answer;
    }
    public int[] solution1(int[] arr) {

        int[]  answer = {};
        if (arr.length == 0) {
            return new int[]{-1};
        }
        List<Integer> intarr = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        int minValue = Arrays.stream(arr).min().getAsInt();
        intarr.remove(intarr.indexOf(minValue));
        return answer = intarr.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int[] arr) {

        if (arr.length <= 1) return new int[]{-1}; // 원소가 하나뿐이면 [-1] 반환

        int min = Arrays.stream(arr).min().getAsInt(); // 최솟값 찾기
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); // Java 8+ 호환
        list.remove(Integer.valueOf(min)); // 최솟값 제거

        return list.stream().mapToInt(Integer::intValue).toArray(); // 리스트를 배열로 변환
    }
}
