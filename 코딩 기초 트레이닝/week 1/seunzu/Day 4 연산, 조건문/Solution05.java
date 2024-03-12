package basic.week1.day4;

import java.util.Scanner;

public class Solution05 {
    // flag에 따라 다른 값 반환하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();

        Solution05 solution = new Solution05();

        int result = solution.solution(a, b, flag);
        System.out.println(result);
    }

    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
