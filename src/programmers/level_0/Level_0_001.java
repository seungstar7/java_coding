package programmers.level_0;

import java.util.Scanner;

public class Level_0_001 {


    public static void main(String[] args){
        /**
         * @problem : 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
         * @Data : a = 4, b = 5
         * @out :
         *      a = 4
         *      b = 5
         */
        Scanner sc = new Scanner("4 5");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }



}
