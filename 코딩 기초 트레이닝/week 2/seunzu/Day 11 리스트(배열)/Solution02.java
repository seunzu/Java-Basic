package basic.week2.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Solution02 {
    // 배열 만들기 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Solution02 solution = new Solution02();
        int[] result = solution.solution(n, k);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }

        return answer;
    }
}
