package programmers.level_0;

import java.util.Arrays;

public class Level_0_014 {
    public static void main(String[] args){
        /**
         * @problem : 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
         * @suggestions :
         *                  5 ≤ myString ≤ 20
         *                  1 ≤ pat ≤ 5
         *                  pat은 반드시 myString의 부분 문자열로 주어집니다.
         *                  myString과 pat에 등장하는 알파벳은 대문자와 소문자를 구분합니다.
         *
         * @myString : AbCdEFG
         * @pat : dE
         * @result : AbCdE
         */
        String myString = "AbCdEFG";
        String pat = "dE";

        System.out.println(myString.indexOf(pat));
        System.out.println(myString.substring(0,myString.lastIndexOf(pat)+pat.length()));

    }

}
