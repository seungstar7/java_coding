package programmers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level_0_004 {


    public static void main(String[] args){
        /**
         * @problem : 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
         * @Data1 : [2, 1, 6]
         * @out1 : 	[2, 1, 6, 5]
         *
         * @Data2 : [5, 2, 1, 7, 5]
         * @out2 : 	[5, 2, 1, 7, 5, 10]
         */
        int[] num_list = {5, 2, 1, 7, 5};
        int[] answer = new int[num_list.length+1];
        for(int i = 0; i < answer.length; i++){
            System.out.println(i);
            if(i<answer.length-1)answer[i] = num_list[i];
            else answer[i] = num_list[i-1]>num_list[i-2] ?  num_list[i-1] - num_list[i-2] : num_list[i-1]*2;
        }

        System.out.println(Arrays.toString(answer));


    }

}
