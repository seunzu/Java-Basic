package basic.week1.day9;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {
    // 접미사 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();

        Solution04 solution = new Solution04();
        String[] result = solution.solution(my_string);
        System.out.println(result);
    }

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
