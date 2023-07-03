package programmers.level_0;

public class Level_0_015 {
    public static void main(String[] args){
        /**
         * @problem : 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  3 ≤ num_str ≤ 100
         * @num_str : 123456789
         * @result : 45
         */
        String myString = "123456789";
        String[] ch = myString.split("");
        int answer = 0;
        for(String c : ch){
            answer = answer + Integer.parseInt(c);
        }
        System.out.println(answer);

    }

}
