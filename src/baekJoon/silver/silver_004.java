package baekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class silver_004 {

    public static void main(String[] args) throws IOException {
        silver_004 sol = new silver_004();
        sol.solution();
    }

    private void solution () {


        long N = 16;
        long M = 29;
        long result = 1;
        for(int j = 0; j < N; j++) {
            result *= (M - j);
            System.out.println(result+"중간리절트");
            result /= (j + 1);
            System.out.println(result+"중간리절트2");
        }

        System.out.println(result);


    }
}
