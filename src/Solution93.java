import  java.util.Random;

public class Solution93 {

    // if [[80,20],[50,40],[30,10]]
    // if  k = 80
    // resilt = 3

    Solution93(){};
    public int solution(int k, int[][] dungeons) {
       int answer  = -1;
       int maxNum = dungeons.length;
       int startNum = 0;
       answer = countCheck(k,startNum ,maxNum, dungeons);
    return  answer;
    }

    private int countCheck(int k,int startNum, int maxlength, int [][] dungeons) {
          if( maxlength == 0)
          {
             return startNum;
          }
          if(k >= dungeons[startNum][0] )
          {
              k = k - dungeons[startNum][1];
              startNum ++;
          }
          maxlength --;
         return  countCheck( k, startNum,  maxlength,  dungeons);

    }
}
