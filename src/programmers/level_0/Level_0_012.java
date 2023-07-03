package programmers.level_0;

import java.util.Arrays;

public class Level_0_012 {
    public static void main(String[] args){
        /**
         * @problem : 정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  2 ≤ num_list의 길이 ≤ 30
         *                  1 ≤ num_list의 원소 ≤ 9
         *                  1 ≤ n ≤ num_list의 길이
         * @num_list : [2, 1, 6]
         * @n : 3
         * @result : [6]
         *
         * @num_list : [5, 2, 1, 7, 5]
         * @n : 2
         * @result : 	[2, 1, 7, 5]
         *
         */
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;
        n--;
        int[] answer = new int[num_list.length-n];
        for (int i = 0; i < answer.length; i++){
            answer[i] = num_list[i+n];
        }
        System.out.println(Arrays.toString(answer));
    }

}
