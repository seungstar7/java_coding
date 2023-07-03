package programmers.level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level_0_018 {
    public static void main(String[] args){
        /**
         * @problem : 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  2 ≤ num_list의 길이 ≤ 20
         *                  1 ≤ num_list의 원소 ≤ 9
         *
         * @num_list : [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]
         * @result : 51
         *
         * @num_list : [2, 3, 4, 5]
         * @result : 120
         */
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int answer = 1;
        int length = num_list.length;
        for(int i = 0; i < length; i++){
            if(length<11)answer*=num_list[i];
            else answer+=num_list[i];
        }
        System.out.println(length<11 ? answer : answer-1);

        //스트림 버전
        IntStream stream = IntStream.of(num_list);
        System.out.println(IntStream.of(num_list).sum());
        System.out.println(num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b));

    }

}
