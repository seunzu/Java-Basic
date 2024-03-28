package basic.week3.day23;

public class Solution01 {
    // 부분 문자열
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
