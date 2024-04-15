package introduction.week4.day7;

public class Solution03 {
    // 양꼬치
    public int solution(int n, int k) {
        if (n >= 10) {
            return (n * 12000) + (k * 2000) - (n / 10 * 2000);
        } else {
            return (n  * 12000) + (k * 2000);
        }
    }
}
