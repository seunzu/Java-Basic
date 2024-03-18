package basic.week2.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution04 {
    // 2의 영역
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution02 solution = new Solution02();
        int result = solution.solution(arr);
        System.out.println(result);
    }

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }

        if (list.size() == 0) return new int[]{-1};

        int start = list.get(0);
        int end = list.get(list.size() - 1);

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
