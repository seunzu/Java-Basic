package basic.week1.day3;

import java.util.Scanner;

public class Solution03 {
    // 문자열 곱하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int k = sc.nextInt();

        Solution03 solution = new Solution03();

        String result = solution.solution(my_string, k);
        System.out.println(result);
    }

    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
