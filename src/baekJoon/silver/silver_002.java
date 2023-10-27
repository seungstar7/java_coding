package baekJoon.silver;

import java.util.Scanner;

public class silver_002 {


    public static void main(String[] args){
        silver_002 sol =  new silver_002();
        Scanner scanner = new Scanner(System.in);
        int num = 3;

        //스캐너로 바꿀부분
        String[][] strings = new String[num][6];
        strings[0] = "0 0 13 40 0 37".split(" ");
        strings[1] = "0 0 3 0 7 4".split(" ");
        strings[2] = "1 1 1 1 1 5".split(" ");


        int[][] turretArr = new int[num][6];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < 6; j++){
                turretArr[i][j] = Integer.parseInt(strings[i][j]);
            }
        }
        for(int[] turret : turretArr){
            sol.solution(turret);
        }

        sol.solution(new int[]{0,0,6,1,1,3});
    }
    public void solution(int[] turret) {
        double rLength = turret[2] + turret[5];
        double rDiff = Math.abs(turret[2] - turret[5]);
        double distance = Math.sqrt(Math.pow((turret[0]-turret[3]),2) + Math.pow((turret[1]-turret[4]),2));
        if(distance == 0.0 && turret[2] == turret[5])System.out.println(-1);
        else if(rLength==distance || rDiff==distance)System.out.println(1);
        else if(rDiff < distance && distance < rLength)System.out.println(2);
        else System.out.println(0);

    }

}
