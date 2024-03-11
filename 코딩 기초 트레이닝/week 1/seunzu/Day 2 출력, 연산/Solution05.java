package basic.week1.day2;

import java.util.Scanner;

public class Solution05 {
    // 문자열 겹쳐쓰기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        Solution05 solution = new Solution05();

        String result = solution.solution(my_string, overwrite_string, s);
        System.out.println(result);
    }
    public String solution(String my_string, String overwrite_string, int s) {
//        String answer = "";
//        int len01 = overwrite_string.length();
//        int len02 = my_string.length();
//
//        String sub01 = my_string.substring(0, s);
//        String sub02 = my_string.substring((s+len01), len02);
//
//        answer += sub01 + overwrite_string + sub02;
//
//        return answer;

        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}
