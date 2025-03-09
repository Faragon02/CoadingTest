public class Solution10 {

    public double solution(int[] numbers) {
        double answer = 0;
        double count = numbers.length;
        for(int a: numbers){
            answer  += a;
        }
        answer= answer/ count;
        return answer;
    }
}
