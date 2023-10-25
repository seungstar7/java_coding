package programmers.level_2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class Level_2_002 {


    public static void main(String[] args){
        Level_2_002 sol =  new Level_2_002();

        String[][] s1 = {{"korean", "11:40", "30"}, {"math", "12:30", "40"}, {"english", "12:10", "20"}};
        String[][] s2 = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        String[][] s3 = {{"1", "00:00", "30"}, {"2", "00:10", "40"}, {"3", "00:20", "10"}, {"4", "00:25", "10"}, {"5", "01:10", "10"}};
        String[][] s4 = {{"1", "00:00", "30"}, {"2", "00:10", "10"}, {"3", "00:30", "10"}, {"4", "00:50", "10"}};
//        sol.solution(s1);
        sol.solution(s2);
        sol.solution(s3);
    }

    public String[] solution(String[][] plans) {

        String[] answer = new String[plans.length];
        Arrays.sort(plans, ((x, y) -> (x[1]).compareTo(y[1])));
        Stack<String[]> stack = new Stack<>();
        int insertIdx = 0;

        for(int i = 0; i < plans.length; i++){
            String[] time = plans[i][1].split(":");
            if(i==plans.length-1){
                answer[insertIdx] = plans[i][0];
                insertIdx++;
                break;
            }
            int convertTime = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);
            String[] time2;
            int convertTime2 = 0;
            if(i<plans.length-1){
                time2 = plans[i+1][1].split(":");
                convertTime2 = (Integer.parseInt(time2[0]) * 60) + Integer.parseInt(time2[1]);
            }
            int recordTime = convertTime2 - (convertTime+Integer.parseInt(plans[i][2]));
            //다음 작업할 잔여시간이 없다면
            if(recordTime < 0){
                stack.push(new String[]{plans[i][0],Integer.toString(recordTime*-1)});
            }else{
                //다음 작업할 잔여시간이 있다면
                answer[insertIdx] = plans[i][0];
                insertIdx++;
                //배열에 추가하고  남은 시간동안 다음 할일 찾아보기
                int totalSum = 0;
                while (true){
                    //스택에 없으면 빠져나오기
                    if(stack.empty())break;
                    String[] now =  stack.pop();
                    //현재 수행가능한 잔여타임에서 내 시간 빼기
                    totalSum =  recordTime - Integer.parseInt(now[1]);
                    // 남은 시간에서 시간이 충분하다면
                    if(totalSum<0){
                        now[1] = totalSum*-1 + "";
                        System.out.println(now[1]);
                        stack.push(now);
                        break;
                    }
                    //잔여시간 빼기
                    recordTime -= Integer.parseInt(now[1]);
                    answer[insertIdx] = now[0];
                    insertIdx++;

                }
            }
        }

        while (true){
            System.out.println("emf?");
            if(stack.empty())break;
            String[] now =  stack.pop();
            System.out.println(now[0]);
            answer[insertIdx] = now[0];
            insertIdx++;
        }

        System.out.println(Arrays.toString(answer));

//
//
//
//        String myTime = "10:70";
//        String myTime2 = "10:10";
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
//            for(String[] item : plans){
//                Date date1 = sdf.parse(item[1]);
//                Date date2 = sdf.parse(item[1]);
//            }
//            stack.push(plans[0][0]);
//            stack.push(plans[0][1]);
//
//
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//


//        //스케줄 시작순으로 정렬
//        for(String[] item : plans){
//
//        }
        return answer;
    }

}
