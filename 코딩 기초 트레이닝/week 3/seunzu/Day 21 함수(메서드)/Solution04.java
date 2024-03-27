package basic.week3.day21;

public class Solution04 {
    // 문자열 정수의 합
    public int solution(String num_str) {
        int total = 0;
        String[] str = num_str.split("");

        for (int i = 0; i < str.length; i++) {
            total += Integer.parseInt(str[i]);
        }

        return total;
    }
}
