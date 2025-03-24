package lv1;

import java.util.Arrays;
import java.util.List;

public class Solution24 {
    public String solution(String[] seoul) {
        String answer = "";
        int index = Arrays.asList(seoul).indexOf("Kim");
        answer = String.format("김서방은 %d에 있다",index);
        return answer;
    }

    public String solution1(String[] seoul) {
        String answer = "";
        int index = Arrays.stream(seoul).toList().indexOf("Kim");
        answer = String.format("김서방은 %d에 있다",index);
        return answer;
    }
}
