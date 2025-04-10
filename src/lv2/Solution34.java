package lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution34 {
    public String solution(String s) {
        String answer = "";
        List<String> toAscII  = Arrays.stream(s.split("")).map(String::new).collect(Collectors.toList());
        Collections.sort(toAscII, Collections.reverseOrder());
        return answer = toAscII.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
