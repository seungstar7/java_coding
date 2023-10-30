package programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Level_1_002 {


    public static void main(String[] args){
        /**
         * @problem : 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
         * @Data : "100"	"203045"	"0"
         */
        Level_1_002 sol = new Level_1_002();

        String x = "100";
        String y = "203045";

        sol.solution(x,y);

    }

    public String solution (String x, String y){
        String[] xArr = x.split("");
        StringBuffer ySB = new StringBuffer(y);
        StringBuffer sb = new StringBuffer();
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.stream(xArr).forEach((item)->{
            int idx = ySB.indexOf(item);
            if(idx>-1){
                ySB.deleteCharAt(idx);
                list.add(Integer.parseInt(item));
                sb.append(item);
            }
        });

        Collections.sort(list,Collections.reverseOrder());
        if(list.size()==0)return "-1";
        StringBuffer result = new StringBuffer();
        list.forEach((item)->{
            result.append(Integer.toString(item));
        });
        String stringInt =Integer.toString(Integer.parseInt(result.toString()));
        return stringInt;
    }

}
