package introduction.week4.day6;

public class Solution03 {
    // 짝수 홀수 개수
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}
