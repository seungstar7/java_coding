package programmers.level_0;

import java.util.Arrays;

public class Level_0_013 {
    public static void main(String[] args){
        /**
         * @problem : 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  3 ≤ num_list의 길이 ≤ 100
         * 1 ≤ num_list의 원소 ≤ 100
         * 1 ≤ n ≤ 100
         *
         * @n : 3
         * @num_list : [1, 2, 3, 4, 5]
         * @result : 1
         */
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;

        System.out.println(Arrays.stream(num_list).filter(i -> i==n).count());

    }

}
