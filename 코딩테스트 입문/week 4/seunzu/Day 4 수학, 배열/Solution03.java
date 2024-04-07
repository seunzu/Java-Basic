package introduction.week4.day4;

public class Solution03 {
    // 피자 나눠 먹기 (3)
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
