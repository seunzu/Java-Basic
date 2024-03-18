package basic.week2.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution01 {
    // 리스트 자르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] slicer = new int[m];
        int[] num_list = new int[k];

        for (int i = 0; i < m; i++) {
            slicer[i] = sc.nextInt();
        }

        for (int i = 0; i < k; i++) {
            num_list[i] = sc.nextInt();
        }

        Solution01 solution = new Solution01();
        int[] result = solution.solution(n, slicer, num_list);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if(n == 1) {
            for(int i = 0; i < b+1; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 2) {
            for(int i = a; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 3) {
            for(int i = a; i < b+1; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 4) {
            for(int i = a; i < b+1; i+=c) {
                list.add(num_list[i]);
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}
