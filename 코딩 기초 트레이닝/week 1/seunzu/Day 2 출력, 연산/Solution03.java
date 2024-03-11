package basic.week1.day2;

import java.util.Scanner;

public class Solution03 {
    // 문자열 돌리기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
