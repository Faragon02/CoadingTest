
import lv1.Solution24;
import lv1.Solution25;
import lv1.Solution26;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//          Solution93 solv = new Solution93();
//           int [][] dungeons = { {80, 20},{50,40}, {30,10} };
//           //int [][] dungeons = { {80, 20}, {30,10}, {50,40} };
//          System.out.println(solv.solution(80, dungeons));

        Solution26 solTest = new Solution26();
        int[] arr = new int[]{1,2,3};
        boolean[] signs = new boolean[]{false,false,true};
        System.out.println(solTest.solution(arr, signs));
    }
}