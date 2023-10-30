package programmers.level_2;

import java.util.Arrays;

public class Level_2_004 {


    public static void main(String[] args){
        Level_2_004 sol =  new Level_2_004();

        String[] minerals1 = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
        int[] picks1 = {1, 3, 2};

        String[] minerals2 = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
        int[] picks2 = {0, 1, 1};


        sol.solution(picks1,minerals1);
        System.out.println("============================================");
        sol.solution(picks2,minerals2);
    }

    static int dia;
    static int iron;
    static int stone;
    static int[] rangeCost;

    static int diggingTimes;
    static int kockIdx;
    public int getKock () {
        if(kockIdx>=diggingTimes)return 0;
        int biggerCnt = 0;
        int pivot = rangeCost[kockIdx];
        for(int i = kockIdx; i < rangeCost.length; i++){
            if(rangeCost[i]>pivot)biggerCnt++;
        }
        if(dia-biggerCnt>0){
            dia--;
            kockIdx++;
            return 25;
        }
        else if (iron-biggerCnt>0){
            iron--;
            kockIdx++;
            return 5;
        }
        else if (stone-biggerCnt>0){
            stone--;
            kockIdx++;
            return 1;
        }
        else return 0;
    }
    public int solution(int[] picks, String[] minerals) {
        dia = picks[0];
        iron = picks[1];
        stone = picks[2];
        diggingTimes = dia + iron + stone;
        kockIdx = 0;

        int length = minerals.length%5==0 ? minerals.length/5 : minerals.length/5+1;
        rangeCost = new int[length];
        int sum = 0;
        int index = 0;
        for(int i = 0; i < minerals.length; i++){
            String m = minerals[i];
            switch (m){
                case "diamond" :
                    sum += 3;
                    break;
                case "iron" :
                    sum += 2;
                    break;
                case "stone" :
                    sum += 1;
                    break;
            }
            if(i%5==4 || i==minerals.length-1){
                rangeCost[index] = sum;
                sum = 0;
                index++;
            }
        }

        int stress = 0;
        int damage = getKock();
        int ii = 0;
        for(String mineral : minerals){
            if(damage==0)break;
            switch (mineral){
                case "diamond" :
                    stress += 25/damage;
                    break;
                case "iron" :
                    stress += damage >= 5 ? 1 : 5;
                    break;
                case "stone" :
                    stress += 1;
                    break;
            }
            if(ii%5==4)damage = getKock();
            ii++;
        }

        System.out.println(stress);

        return stress;
    }

}
