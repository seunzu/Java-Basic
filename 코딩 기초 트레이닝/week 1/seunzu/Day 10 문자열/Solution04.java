package basic.week1.day10;

import java.util.Scanner;

public class Solution04 {
    // 세로 읽기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int m = sc.nextInt();
        int c = sc.nextInt();

        Solution04 solution = new Solution04();
        String result = solution.solution(my_string, m, c);
        System.out.println(result);
    }

    public String solution(String my_string, int m, int c) {
        StringBuffer sb = new StringBuffer();

        int start = c - 1;
        while (start < my_string.length()) {
            sb.append(my_string.charAt(start));
            start += m;
        }
        return sb.toString();
    }
}
