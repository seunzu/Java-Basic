package basic.week1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution05 {
    // 수열과 구간 쿼리 2
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

        Solution05 solution = new Solution05();
        int[] result = solution.solution(arr, queries);
        System.out.println(Arrays.toString(result));

    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                }
            }

            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;
    }
}
