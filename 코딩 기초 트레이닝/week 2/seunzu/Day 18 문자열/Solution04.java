package basic.week2.day18;

public class Solution04 {
    // 문자열 바꿔서 찾기
    public int solution(String myString, String pat) {
        String str = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');

        if (str.contains(pat)) {
            return 1;
        }

        return 0;
    }
}
