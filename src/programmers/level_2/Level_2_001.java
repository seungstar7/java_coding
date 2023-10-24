package programmers.level_2;

public class Level_2_001 {


    public static void main(String[] args){
        Level_2_001 sol =  new Level_2_001();

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 1, 1, 2, 3, 4, 5};
        int[] s3 = {2, 2, 2, 2, 2};
        sol.solution(s1,7);
        sol.solution(s2,5);
        sol.solution(s3,6);

        sol.solution(new int[]{1, 1, 1, 1, 1, 1, 1},7);
        sol.solution(new int[]{7,5,5,1,1,50,50},100);


    }

    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int startIdx = 0;
        int endIdx = 0;
        int resultidx1 = 0;
        int resultidx2 = 0;
        int range = 100000000;
        int sum = 0;

        while (true){
            if(endIdx>=sequence.length)break;
            //현재 부분 합
            int tmpSum = sum + sequence[endIdx];
            System.out.println(sequence[endIdx] + "인덱스 넘");
            System.out.println(tmpSum + "현재 부분 합");
            if(tmpSum < k){
                sum += sequence[endIdx];
                endIdx++;
                continue;
            }
            if(k==tmpSum) {
                System.out.println("끼야호~");
                sum = tmpSum;
                if(range > endIdx - startIdx){
                    resultidx1 = startIdx;
                    resultidx2 = endIdx;
                    range = endIdx - startIdx;
                }
                endIdx++;
                continue;
            }
            if (tmpSum > k) {
                sum -= sequence[startIdx];
                startIdx++;
            }
        }


        answer[0] = resultidx1;
        answer[1] = resultidx2;

        return answer;
    }

}
