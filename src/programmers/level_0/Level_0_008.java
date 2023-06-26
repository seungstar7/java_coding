package programmers.level_0;

import java.util.Arrays;

public class Level_0_008 {
    public static void main(String[] args){
        /**
         * @problem : 문자열 str이 주어집니다. 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
         * @Data1 : abcde
         * @out1 :
         *          a
         *          b
         *          c
         *          d
         *          e
         */
        String a = "abcde";
        char[] aa = a.toCharArray();
        System.out.println(aa);
        for(char b : aa){
            System.out.println(b);
        }
    }

}
