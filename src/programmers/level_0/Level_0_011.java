package programmers.level_0;

public class Level_0_011 {
    public static void main(String[] args){
        /**
         * @problem : 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  2 ≤ num_list의 길이 ≤ 10
         *                  1 ≤ num_list의 원소 ≤ 9
         *                  num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
         * @num_list : [3, 4, 5, 2, 1]
         * @result : 393
         *
         * @num_list : [5, 7, 8, 3]
         * @result : 581
         *
         */
        int[] num_list = {3, 4, 5, 2, 1};
        String odd = "";
        String even = "";
        for(int n : num_list){
            if(n%2==0)even += Integer.toString(n);
            else odd += Integer.toString(n);
        }
        System.out.println(Integer.parseInt(odd)+Integer.parseInt(even));
    }

}
