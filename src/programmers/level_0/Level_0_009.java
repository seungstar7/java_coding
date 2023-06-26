package programmers.level_0;

import java.util.Arrays;

public class Level_0_009 {
    public static void main(String[] args){
        /**
         * @problem : 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  5 ≤ num_list의 길이 ≤ 20
         *                  1 ≤ num_list의 원소 ≤ 9
         *                  1 ≤ n ≤ 4
         * @num_list : [4, 2, 6, 1, 7, 6]
         * @n : 2
         * @result : [4, 6, 7]
         */
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        int[] answer = new int[num_list.length%n==0?num_list.length/n : (num_list.length/n)+1];
        System.out.println(answer.length);
        for(int i = 0;  i < answer.length; i++){
            System.out.println(i);
            answer[i] = num_list[i*n];
        }
        System.out.println(Arrays.toString(answer));
    }

}
