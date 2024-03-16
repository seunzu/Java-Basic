package basic.week1.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {
    // 콜라츠 수열 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution04 solution = new Solution04();
        int[] result =solution.solution(n);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
