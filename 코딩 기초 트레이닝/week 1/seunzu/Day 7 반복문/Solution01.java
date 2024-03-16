package basic.week1.day7;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {
    // 수열과 구간 쿼리 4
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
            for (int j = 0; j < cols; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

        Solution01 solution = new Solution01();
        int[] result = solution.solution(arr, queries);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {
//        for (int[] query : queries) {
//            int s = query[0];
//            int e = query[1];
//            int k = query[2];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
