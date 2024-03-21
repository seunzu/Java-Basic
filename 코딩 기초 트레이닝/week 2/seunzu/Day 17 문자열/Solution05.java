package basic.week2.day17;

public class Solution05 {
    // 공백으로 구분하기 2
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
