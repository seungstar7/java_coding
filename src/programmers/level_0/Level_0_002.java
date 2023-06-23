package programmers.level_0;

import java.util.Scanner;

public class Level_0_002 {


    public static void main(String[] args){
        /**
         * @problem : 문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
         * @Data : string 5
         * @out : stringstringstringstringstring
         *
         */
        Scanner sc = new Scanner("string 5");

        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
    }

}
