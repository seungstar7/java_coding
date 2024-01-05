package baekJoon.bronze;

import java.util.Arrays;

public class bronze_003 {

    public static void main(String[] args){
        int basket = 5;
        int[] basketArr = new int[basket];
        int cycle = 4;
        for(int i = 0; i <= cycle; i++){
            System.out.println(cycle);
            int startIdx = 1-1;
            int endIdx = 4-1;
            int ballNum = 1;
            for(int j = startIdx; j <= endIdx; j++){
                basketArr[j] = ballNum;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int result : basketArr)sb.append(result + " ");
        System.out.println(sb.toString().trim());
    }

}
