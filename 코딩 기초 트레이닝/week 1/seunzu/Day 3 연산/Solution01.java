package basic.week1.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {
    // 문자열 섞기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        Solution01 solution = new Solution01();

        String result = solution.solution(str1, str2);
        System.out.println(result);
    }

    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return sb.toString();
    }
}
