package basic.week1.day10;

import java.util.Scanner;

public class Solution01 {
    // 문자열의 앞의 n글자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int n = sc.nextInt();

        Solution01 solution = new Solution01();
        String result = solution.solution(my_string, n);
        System.out.println(result);
    }
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
