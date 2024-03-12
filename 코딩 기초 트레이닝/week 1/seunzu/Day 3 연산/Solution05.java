package basic.week1.day3;

import java.util.Scanner;

public class Solution05 {
    // 두 수의 연산값 비교하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution05 solution = new Solution05();

        int result = solution.solution(a, b);
        System.out.println(result);
    }

    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int n = 2 * a * b;

        if (Integer.parseInt(ab) >= n) {
            return Integer.parseInt(ab);
        } else {
            return n;
        }
    }
}
