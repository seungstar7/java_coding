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
//        sol.solution(s1);
        sol.solution(s2);
    }

    public String[] solution(String[][] plans) {

        String[] answer = new String[plans.length];
        Arrays.sort(plans, ((x, y) -> (x[1]).compareTo(y[1])));
        Stack<String> stack = new Stack<>();
        for(String[] sd : plans){
            String[] time = sd[1].split(":");
            System.out.println(Arrays.toString(sd));
        }

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

    public static String formatTime(LocalDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }/*  w w  w . ja  v a2  s .  co  m*/

}
