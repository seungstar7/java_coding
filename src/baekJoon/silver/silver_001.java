package baekJoon.silver;

import java.util.Arrays;

public class silver_001 {


    public static void main(String[] args){
        silver_001 sol =  new silver_001();
        sol.solution();

    }
    public void solution() {
        int d[] = new int [10040];//9999로 생성되는 최댓값이 10035이므로 10036까
        for (int i = 1; i <= 10000; i++) {
            d[dn(i)] = 1;
            if (d[i]!=1) System.out.println(i);
        }
    }

    static int dn(int i){
        int res = i;
        String[] resStr = Integer.toString(res).split("");
        for(String tmpNum : resStr){
            int num = Integer.parseInt(tmpNum);
            res += num;
        }
        return res;
    }

}
