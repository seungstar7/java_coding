package programmers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Level_0_019 {
    public static void main(String[] args){
        /**
         * @problem : 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
         * @suggestions :
         *                  1 ≤ arr의 길이 ≤ 100
         *                  1 ≤ arr의 원소 ≤ 100
         *
         * @arr : [5, 1, 4]
         * @result : [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
         *
         * @num_list : [6, 6]
         * @result : [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
         */
        int[] arr = {5, 1, 4};
        List<Integer> intList = new ArrayList<Integer>();
        for(int a : arr){
            for(int i = 0; i < a; i++){
                intList.add(a);
            }
        }
        System.out.println(intList.stream()
                .mapToInt(i -> i)
                .toArray());

    }

}
