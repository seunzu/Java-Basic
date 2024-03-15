package basic.week1.day5;

import java.util.Scanner;

public class Solution03 {
    // 주사위 게임 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Solution03 solution = new Solution03();
        int result = solution.solution(a, b, c);
        System.out.println(result);
    }

    public int solution(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return a + b + c;
        } else if (a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            return (a + b + c) * (a * a + b * b + c * c);
        }
    }
}

