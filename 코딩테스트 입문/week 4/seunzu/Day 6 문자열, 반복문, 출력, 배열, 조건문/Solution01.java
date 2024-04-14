package introduction.week4.day6;

public class Solution01 {
    // 문자열 뒤집기
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
