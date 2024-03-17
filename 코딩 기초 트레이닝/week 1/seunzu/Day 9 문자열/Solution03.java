package basic.week1.day9;

import java.util.Scanner;

public class Solution03 {
    // 문자열의 뒤의 n글자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int n = sc.nextInt();

        Solution03 solution = new Solution03();
        String result = solution.solution(my_string, n);
        System.out.println(result);
    }

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
