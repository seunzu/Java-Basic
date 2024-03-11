package basic.week1.day2;

import java.util.Scanner;

public class Solution01 {
    // 덧셈식 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

//        System.out.println(a + " + " + b + " = " + c);
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
