package baekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class silver_003 {


    static int case0;
    static int case1;
    static int caseSum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 3;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int N = 40;
            fibonacci(N);
            sb.append(case0).append(' ').append(case1).append('\n');
        }
        System.out.println(sb);
    }
    public static void fibonacci(int n) {
        case0 = 1;
        case1 = 0;
        caseSum = 1;

        for (int i = 0; i < n; i++) {
            case0 = case1;
            case1 = caseSum;
            caseSum = case0 + case1;
        }
    }

}
