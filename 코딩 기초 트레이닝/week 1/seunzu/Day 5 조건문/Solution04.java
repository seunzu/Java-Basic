package basic.week1.day5;

import java.util.Scanner;

public class Solution04 {
    // 원소들의 곱과 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_list = new int[n];

        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        Solution04 solution = new Solution04();
        int result = solution.solution(num_list);
        System.out.println(result);
    }

    public int solution(int[] num_list) {
        int sum = 0;
        int times = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            times *= num_list[i];
        }

        if (times < sum * sum) return 1;
        else return 0;
    }
}
