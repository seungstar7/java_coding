package programmers.level_0;

import java.util.Arrays;

public class Level_0_006 {


    public static void main(String[] args){
        /**
         * @problem : 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
         * @Data1 : 1, 2, 3, 100, 99, 98
         * @out1 : 	2, 2, 6, 50, 99, 49
         */
        int[] arr = {1, 2, 3, 100, 99, 98};
        int i = 0;
        while (true){
            int num = arr[i];
            if(num < 50){
                arr[i] = arr[i]%2==0 ? arr[i] : arr[i]*2;
            }else{
                arr[i] = arr[i]%2==0 ?arr[i]/2 : arr[i];
            }
            i++;
            if(i == arr.length)break;
        }
        System.out.println(Arrays.toString(arr));
    }

}
