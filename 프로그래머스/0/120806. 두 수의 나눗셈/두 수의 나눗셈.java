
class Solution {
 public int solution(int num1, int num2) {
        int answer = 0;
        answer = solutionDouble(num1, num2);
        return answer;
    }
   private int solutionDouble(double num1, double num2)
    {
        double tempAnswer = (num1 /num2) *1000;
        return  (int)tempAnswer;
    }
}