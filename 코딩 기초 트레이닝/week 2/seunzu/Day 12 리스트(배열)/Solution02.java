package basic.week2.day12;

import java.util.Scanner;

public class Solution02 {
    //  첫 번째로 나오는 음수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_list = new int[n];

        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        Solution02 solution = new Solution02();
        int result = solution.solution(num_list);
        System.out.println(result);
    }

    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0)
                return i;
        }
        return -1;
    }
}
