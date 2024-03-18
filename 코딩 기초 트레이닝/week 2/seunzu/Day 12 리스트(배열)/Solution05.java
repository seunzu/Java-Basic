package basic.week2.day12;

import java.util.Arrays;
import java.util.Scanner;

public class Solution05 {
    // 배열 조각하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] query = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            query[i] = sc.nextInt();
        }

        Solution05 solution = new Solution05();
        int[] result = solution.solution(arr, query);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }

        return arr;
    }
}
