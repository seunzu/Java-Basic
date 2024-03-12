package basic.week1.day4;

import java.util.Scanner;

public class Solution04 {
    // 조건 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ineq = sc.next();
        String eq = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();

        Solution04 solution = new Solution04();

        int result = solution.solution(ineq, eq, n, m);
        System.out.println(result);
    }

    public int solution(String ineq, String eq, int n, int m) {
        String str = ineq + eq;

        if(str.equals(">=")) {
            return n >= m ? 1 : 0;
        }
        if(str.equals("<=")) {
            return n <= m ? 1 : 0;
        }
        if(str.equals(">!")) {
            return n > m ? 1 : 0;
        }
        return n < m ? 1 : 0;
    }
}
