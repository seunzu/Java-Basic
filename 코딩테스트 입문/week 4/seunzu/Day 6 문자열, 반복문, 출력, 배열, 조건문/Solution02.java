package introduction.week4.day6;

import java.util.Scanner;

public class Solution02 {
    // 직각삼각형 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
