package programmers.level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level_0_016 {
    public static void main(String[] args){
        /**
         * @problem : 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
         * @suggestions :
         *                  3 ≤ num_list의 길이 ≤ 100
         * 1 ≤ num_list의 원소 ≤ 100
         * 1 ≤ n ≤ 100
         *
         * @num_list : [12, 4, 15, 46, 38, -2, 15]
         * @result : 5
         */
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        int answer = -1;
        int i = 0;
        for(int n : num_list){
            if(n<0){
                answer=i;
                break;
            }
            i++;
        }
        System.out.println(answer);

        //스트림 버전
        System.out.println(IntStream.range(0, num_list.length).filter(idx -> num_list[idx] < 0).findFirst().orElse(-1));

    }

}
