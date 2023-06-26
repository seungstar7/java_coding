package programmers.level_0;

import java.util.Arrays;

public class Level_0_010 {
    public static void main(String[] args){
        /**
         * @problem : 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
         *  단, 알파벳 대문자와 소문자는 구분하지 않습니다.
         * @suggestions :
         *                  1 ≤ myString의 길이 ≤ 100,000
         *                  1 ≤ pat의 길이 ≤ 300
         *                  myString과 pat은 모두 알파벳으로 이루어진 문자열입니다.
         * @myString : AbCdEfG
         * @pat : aBc
         * @result : 1
         *
         * @myString : aaAA
         * @pat : aaaaa
         * @result : 0
         *
         */
        String myString = "AbCdEfG";
        String pat = "aBc";

        System.out.println(myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0);
    }

}
