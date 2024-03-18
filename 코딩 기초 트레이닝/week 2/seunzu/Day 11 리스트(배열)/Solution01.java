package basic.week2.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {
    // 문자 개수 세기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();

        Solution01 solution = new Solution01();
        int[] result = solution.solution(my_string);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                answer[26 + ch - 'a']++;
            }
        }

        return answer;
    }
}
