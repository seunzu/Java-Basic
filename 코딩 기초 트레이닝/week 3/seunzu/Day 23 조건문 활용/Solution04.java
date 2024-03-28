package basic.week3.day23;

public class Solution04 {
    // 주사위 게임 1
    public int solution(int a, int b) {
        if (a % 2 == 1 && b % 2 == 1) {
            return a * a + b * b;
        }
        else if (a % 2 == 1 || b % 2 == 1) {
            return 2 * (a + b);
        }
        else return Math.abs(a-b);
    }
}
