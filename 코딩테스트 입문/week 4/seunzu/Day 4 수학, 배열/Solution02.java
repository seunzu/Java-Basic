package introduction.week4.day4;

public class Solution02 {
    // 피자 나눠 먹기 (2)
    public int solution(int n) {
        int answer = 1;

        while (true) {
            if (6 * answer % n == 0) {
                return answer;
            }

            answer++;
        }
    }
}
