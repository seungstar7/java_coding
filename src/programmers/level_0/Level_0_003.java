package programmers.level_0;

import java.util.Scanner;

public class Level_0_003 {


    public static void main(String[] args){
        /**
         * @problem : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
         * @Data : aBcDeFg
         * @out : AbCdEfG
         *
         */
        Scanner sc = new Scanner("aBcDeFg");

        String a = sc.next();
        for(int i = 0; i < a.length(); i++){
            char s = a.charAt(i);
            System.out.print(Character.isUpperCase((int) s) ? Character.toLowerCase(s) : Character.toUpperCase(s) );
        }

    }

}
