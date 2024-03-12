package basic.week1.day4;

import java.util.Scanner;

public class Solution02 {
    // 공배수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        Solution02 solution = new Solution02();

        int result = solution.solution(number, n, m);
        System.out.println(result);
    }

    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
