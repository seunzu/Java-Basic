package basic.week1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {
    // 수열과 구간 쿼리 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[] arr = new int[n];
        int[][] queries = new int[rows][cols];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; i < cols; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

        Solution04 solution = new Solution04();
        int[] result = solution.solution(arr, queries);
        System.out.println(Arrays.toString(result));

    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]];

            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }

        return arr;
    }
}
