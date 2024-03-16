package basic.week1.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution05 {
    // 배열 만들기 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution05 solution = new Solution05();
        int[] result = solution.solution(arr);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.size() != 0 && stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.stream().mapToInt(i -> i).toArray();
    }
}
