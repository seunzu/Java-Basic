package basic.week1.day7;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {
    // 카운트 업
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num = sc.nextInt();

        Solution03 solution = new Solution03();
        int[] result =solution.solution(start_num, end_num);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for(int i = 0; i <= end_num - start_num; i++){
            answer[i] = i + start_num;
        }
        return answer;
    }
}
