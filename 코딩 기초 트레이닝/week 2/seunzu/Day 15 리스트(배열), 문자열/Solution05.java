package basic.week2.day15;

public class Solution05 {
    // 원하는 문자열 찾기
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
