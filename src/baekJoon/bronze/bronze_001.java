package baekJoon.bronze;

import java.util.Arrays;

public class bronze_001 {


    public static void main(String[] args){
        bronze_001 sol =  new bronze_001();
        sol.solution();

    }
    public void solution() {
        int[] com = {1,6,3,7,6,2,7,100,9,635,10,4};
        int idx = 0;
        int t = 6;
        while (true){
            t--;
            int n1 = com[idx];
            idx++;
            int n2 = com[idx];
            idx++;
            int[] intArr = new int[4];
            intArr[0] = n1;
            for(int i = 1; i < 4; i++){
                intArr[i] = intArr[i-1] * n1;
            }
            int result = 0;
            switch (n2%4){
                case 0 :
                    result = intArr[3]%10;
                    break;
                case 1 :
                    result = intArr[0]%10;
                    break;
                case 2 :
                    result = intArr[1]%10;
                    break;
                case 3 :
                    result = intArr[2]%10;
                    break;
            }
            if(result==0)result=10;
            System.out.println(result + "리절트");
            if(t==0)break;
        }

    }

}
