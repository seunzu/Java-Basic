package introduction.week4.day4;

public class Solution01 {
    // 피자 나눠 먹기 (1)
    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
