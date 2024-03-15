package basic.week1.day5;

import java.util.Scanner;

public class Solution01 {
    // 코드 처리하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();

        Solution01 solution = new Solution01();

        String result = String.valueOf(solution.solution(code));
        System.out.println(result);
    }

    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            } else if (i % 2 == mode) {
                sb.append(code.charAt(i));
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}
