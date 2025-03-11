import lv1.Solution10;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//          Solution93 solv = new Solution93();
//           int [][] dungeons = { {80, 20},{50,40}, {30,10} };
//           //int [][] dungeons = { {80, 20}, {30,10}, {50,40} };
//          System.out.println(solv.solution(80, dungeons));

        Solution10 solTest = new Solution10();
        int[] test = {1,2,3,4,5,6,7,8,9, 10};
        double Test = solTest.solution(test);
        System.out.println(Test);
    }
}