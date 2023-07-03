package programmers.level_0;

import java.util.Arrays;

public class Level_0_017 {
    public static void main(String[] args){
        /**
         * @problem : 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
         * @suggestions :
         *                  6 ≤ num_list의 길이 ≤ 30
         *                  1 ≤ num_list의 원소 ≤ 100
         *
         * @num_list : [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]
         * @result : [15, 32, 38, 46, 56]
         */
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int idx = 0;
        for(int i = 5; i < num_list.length; i++){
            answer[idx] = num_list[i];
            idx++;
        }
        System.out.println(Arrays.toString(answer));

        //스트림 버전
        System.out.println(Arrays.toString(Arrays.stream(num_list).sorted().skip(5).toArray()));

    }

}
