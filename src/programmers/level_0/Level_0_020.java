package programmers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Level_0_020 {
    public static void main(String[] args){
        //System.out.println(IntStream.range(0, my_strings.length).mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1)).collect(Collectors.joining()));
        /**
         *정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
         *
         * 제한사항
         * 5 ≤ num_list의 길이 ≤ 50
         * -9 ≤ num_list의 원소 ≤ 9
         * 입출력 예
         * num_list	result
         * [4, 2, 6, 1, 7, 6]	17
         * [-1, 2, 5, 6, 3]	8
         * 입출력 예 설명
         * 입출력 예 #1
         *
         * 홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return합니다.
         * 입출력 예 #2
         *
         * 홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return합니다.
         */
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = new int[num_list.length];
        int idx = 0;
        /*
        for(int i = n; i < answer.length; i++){
            answer[idx] = num_list[i];
            idx++;
        }
        for(int i = 0; i < n; i++){
            answer[idx] = num_list[i];
            idx++;
        }*/

        System.arraycopy(num_list,0,answer,num_list.length,num_list.length);

        System.out.println(Arrays.toString(answer));

<<<<<<< HEAD
=======

>>>>>>> refs/rewritten/origin-master
    }


}
