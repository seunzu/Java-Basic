package basic.week1.day1;

import java.util.Scanner;

public class Solution03 {
    // 문자열 반복해서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // ver1
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i < n; i++) {
//            sb.append(str);
//        }
//
//        System.out.println(sb);

        // ver2
//        for(int i = 0; i < n; i++) {
//            System.out.print(str);
//        }

        // ver3
        System.out.println(str.repeat(n));
    }
}
