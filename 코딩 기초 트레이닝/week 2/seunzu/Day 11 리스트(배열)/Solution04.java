package basic.week2.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {
    // 카운트 다운
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end_num = sc.nextInt();

        Solution04 solution = new Solution04();
        int[] result = solution.solution(start, end_num);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int start, int end_num) {
        int[] answer = new int[end_num - start + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start--;
        }

        return answer;
    }
}
