package basic.week1.day4;

import java.util.Scanner;

public class Solution01 {
    // n의 배수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();

        Solution01 solution = new Solution01();

        int result = solution.solution(num, n);
        System.out.println(result);
    }

    public int solution(int num, int n) {
        if (num % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
