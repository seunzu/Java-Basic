package basic.week1.day10;

import java.util.Scanner;

public class Solution05 {
    // qr 코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int r = sc.nextInt();
        String code = sc.next();

        Solution05 solution = new Solution05();
        String result = solution.solution(q, r, code);
        System.out.println(result);
    }

    public String solution(int q, int r, String code) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }
}
