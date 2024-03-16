package basic.week1.day8;

import java.util.Scanner;

public class Solution01 {
    // 간단한 논리 연산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x1 = sc.nextBoolean();
        boolean x2 = sc.nextBoolean();
        boolean x3 = sc.nextBoolean();
        boolean x4 = sc.nextBoolean();


        Solution01 solution = new Solution01();
        boolean result = solution.solution(x1, x2, x3, x4);
        System.out.println(result);
    }

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);

    }
}
