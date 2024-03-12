package basic.week1.day3;

import java.util.Scanner;

public class Solution02 {
    // 문자 리스트를 문자열로 변환하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[length];

        for(int i = 0; i < length; i++) {
            arr[i] = sc.next();
        }

        Solution02 solution = new Solution02();

        String result = solution.solution(arr);
        System.out.println(result);
    }

    public String solution(String[] arr) {
        // ver1
//        String answer = "";
//
//        for(int i = 0; i < arr.length; i++) {
//            answer += arr[i];
//        }
//
//        return answer;

        // ver2
//        StringBuilder sb = new StringBuilder();
//
//        for (String str : arr) {
//            sb.append(str);
//        }
//
//        return sb.toString();

        // ver3
        return String.join("", arr);
    }
}
