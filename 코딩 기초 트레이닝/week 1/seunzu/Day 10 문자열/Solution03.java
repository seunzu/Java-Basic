package basic.week1.day10;

import java.util.Scanner;

public class Solution03 {
    // 문자열 뒤집기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        Solution03 solution = new Solution03();
        String result = solution.solution(my_string, s, e);
        System.out.println(result);
    }

    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s, e + 1);

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        my_string = my_string.replaceAll(str, reverse);

        return my_string;
    }
}
