package programmers.level_2;

import java.util.Arrays;
import java.util.Stack;

public class Level_2_003 {


    public static void main(String[] args){
        Level_2_003 sol =  new Level_2_003();
        /**
         *
         *  2
         *  1 2 3 4 5 6 - > 26
         *
         *
         *  3
         *  1 2 3 4 5 6 - > 69
         *
         */

        int n = 2;
        int[] dice = new int[6];
        for(int i = 0; i < dice.length; i++){
            dice[i] = i+1;
        }
//        Arrays.sort(dice);
//        System.out.println(Arrays.toString(dice));
//        Long getN = Long.valueOf(n);
//        Long bigN = getN * getN;
//        Long sum;
//        sum = Long.valueOf(dice[0]) * (bigN-getN);
//        sum += Long.valueOf(dice[1]) * getN;
//        sum*=4;
//        Long center = Long.valueOf(n)-2; //센터값
//        sum += Long.valueOf(dice[2]) * 4;  // 모서리 => 제일 큰값
//        sum += Long.valueOf(dice[1]) * center * 4; //벽 =>
//        sum += Long.valueOf(dice[0]) * (center * center); // 중앙값
//
//        System.out.println(sum);
//        sol.solution(n,dice);


//
//        int[] s1 = {50,50,50,50,50,50};
//        int[] s2 = {1, 2, 3, 4, 5, 6};
//        int[] s3 = {1, 1, 1, 1, 50, 1};
        int[] s4 = {1, 1, 1, 1, 1, 1};
        int[] s5 = {50, 39, 25, 14, 48, 7};
        int[] s6 = {1, 2, 3, 4, 5, 6};
//        sol.solution(1000000,s1);
//        sol.solution(3,s2);
//        sol.solution(10,s3);
        sol.solution(5,s4);
        sol.solution(10,s5); //56모자람
        sol.solution(1000000,s6);
    }
    public void solution(int n,int[] dice) {

        Arrays.sort(dice);
        Long getN = Long.valueOf(n);
        Long bigN = getN * getN;
        Long sum;
        sum = Long.valueOf(dice[0]) * (bigN-getN);
        sum += Long.valueOf(dice[1]) * getN;
        sum*=4;
        System.out.println("옆면 값" + sum);
        Long center = Long.valueOf(n)-2; //센터값
        System.out.println("센터값" + center);
        sum += Long.valueOf(dice[2]) * 4;  // 모서리 => 제일 큰값
        sum += Long.valueOf(dice[1]) * center * 4; //벽 =>
        sum += Long.valueOf(dice[0]) * (center * center); // 중앙값

        Long sum1 = Long.valueOf(dice[2]) * 4;  // 모서리 => 제일 큰값
        Long sum2 = (Long.valueOf(dice[1]) * center) * 4; //벽 =>
        Long sum3 = Long.valueOf(dice[0]) * (center * center); // 중앙값
        System.out.println("세번째 :" + dice[2]);
        System.out.println("두번째 :" + dice[1]);
        System.out.println("첫번째 :" + dice[0]);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println(sum);
        System.out.println("========================================================");
    }

}
