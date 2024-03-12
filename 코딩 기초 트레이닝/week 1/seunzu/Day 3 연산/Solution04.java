package basic.week1.day3;

import java.util.Scanner;

public class Solution04 {
    // 더 크게 합치기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution04 solution = new Solution04();

        int result = solution.solution(a, b);
        System.out.println(result);
    }

    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }
    }
}
