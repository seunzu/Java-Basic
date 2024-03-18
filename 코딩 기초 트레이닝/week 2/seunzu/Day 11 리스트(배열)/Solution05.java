package basic.week2.day11;

import java.util.Scanner;

public class Solution05 {
    // 가까운 1 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = sc.nextInt();

        Solution05 solution = new Solution05();
        int result = solution.solution(arr, idx);
        System.out.println(result);
    }

    public int solution(int[] arr, int idx) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
