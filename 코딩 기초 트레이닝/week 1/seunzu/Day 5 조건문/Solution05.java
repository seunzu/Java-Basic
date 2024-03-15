package basic.week1.day5;

import java.util.Scanner;

public class Solution05 {
    // 이어 붙인 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_list = new int[n];

        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        Solution05 solution = new Solution05();
        int result = solution.solution(num_list);
        System.out.println(result);
    }

    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }

        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
