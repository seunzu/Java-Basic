package basic.week1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {
    // 마지막 두 원소
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num_list = new int[n];

        for(int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        Solution01 solution = new Solution01();
        int[] result = solution.solution(num_list);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution (int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len+1];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }

        int a = num_list[len-1];
        int b = num_list[len-2];

        answer[answer.length - 1] = a > b ? a - b : a*2;

        return answer;
    }
}

