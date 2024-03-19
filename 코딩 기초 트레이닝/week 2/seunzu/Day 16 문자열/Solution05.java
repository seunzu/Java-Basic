package basic.week2.day16;

public class Solution05 {
    // 특정한 문자를 대문자로 바꾸기
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
