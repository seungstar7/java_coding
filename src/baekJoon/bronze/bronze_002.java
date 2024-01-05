package baekJoon.bronze;

public class bronze_002 {


    public static void main(String[] args){
        int n = 20/4;
        for(int i = 0; i < n; i++){
            System.out.print("long ");
        }
        // repeat 함수 고려 해 볼 것
        System.out.printf("%s%s", "long ".repeat(n -1 ), "long int");
        System.out.println("int");

    }


}
