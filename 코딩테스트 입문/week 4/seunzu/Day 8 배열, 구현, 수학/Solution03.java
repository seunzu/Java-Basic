package introduction.week4.day8;

public class Solution03 {
    // 진료순서 정하기
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++){
            if (answer[i] != 0){
                continue;
            }
            int idx = 1;
            for (int j = 0; j < len; j++){
                if (emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
