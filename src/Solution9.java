public class Solution9 {
    public int solution(int n) {
        int answer = 0;
        answer  =  recursiveFunc(n,  answer);
        return answer;
    }
    public int recursiveFunc(int n, int answer)
    {
        if(n == 0){
            return answer;
        }
        if(n %2 ==0)
        {
            answer += n;
        }
        n--;
        return  recursiveFunc(n, answer);
    }

    //    public int solution(int n) {
//        int answer = 0;
//        int tempInt = 0;
//        for(int i = n; i >= 0; i--)
//        {
//            if(i % 2 ==0){
//                tempInt += i;
//            }
//        }
//        answer = tempInt;
//        return answer;
//    }


}
