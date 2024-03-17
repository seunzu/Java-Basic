package basic.week1.day9;

import java.util.Scanner;

public class Solution02 {
    // 부분 문자열 이어 붙여 문자열 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        String[] my_strings = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            my_strings[i] = sc.next();
        }

        int numParts = sc.nextInt();
        int[][] parts = new int[numParts][2];

        for (int i = 0; i < numParts; i++) {
            parts[i][0] = sc.nextInt();
            parts[i][1] = sc.nextInt();
        }


        Solution02 solution = new Solution02();
        String result = solution.solution(my_strings, parts);
        System.out.println(result);
    }

    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            answer += str.substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }
}
