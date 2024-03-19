package basic.week2.day14;

public class Solution04 {
    // n보다 커질 때까지 더하기
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (answer <= n) {
                answer += numbers[i];
            }
        }

        return answer;
    }
}
