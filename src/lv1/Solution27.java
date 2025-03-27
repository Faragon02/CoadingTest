package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution27 {
    public String solution(String phone_number) {
        String answer = "";
//        String subStr ="";
//        String repeatStr ="";
//        if(phone_number.length() > 4){
//            subStr =  phone_number.substring(phone_number.length() -4);
//            repeatStr = "*".repeat(phone_number.length() -4);
//            answer = repeatStr + subStr;
//        }
//        else{
//            answer = phone_number;
//        }
        List<String> splitStr = List.of(phone_number);
        answer = splitStr.stream()
                .map(str -> str.length() >4?  "*".repeat(str.length() -4) + str.substring(str.length() -4) : str)
                .collect(Collectors.joining());

        return answer;
    }
}
