package basic.week1.day8;

import java.util.Scanner;

public class Solution05 {
    // 문자열 여러 번 뒤집기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] queries = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

        Solution05 solution = new Solution05();
        String result = solution.solution(my_string, queries);
        System.out.println(result);
    }

    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            for (int j = start; j <= (start + end) / 2; j++) {
                char temp = arr[j];
                arr[j] = arr[start + end - j];
                arr[start + end - j] = temp;
            }
        }

        return new String(arr);
    }
}
