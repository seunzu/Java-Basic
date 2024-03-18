package basic.week2.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution03 {
    // 배열 만들기 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] intervals = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                intervals[i][j] = sc.nextInt();
            }
        }

        Solution03 solution = new Solution03();
        int[] result = solution.solution(arr, intervals);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            for (int j = start; j <= end; j++) {
                list.add(arr[j]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
