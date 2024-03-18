package basic.week2.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {
    // 글자 지우기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int n = sc.nextInt();
        int[] indices = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }

        Solution03 solution = new Solution03();
        String result = solution.solution(my_string, indices);
        System.out.println(result);
    }

    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);

        StringBuilder sb = new StringBuilder(my_string);

        // indices 배열 오름차순 정렬 -> 제거한 문자의 인덱스 변경 => 오류
        for (int i = indices.length - 1; i >= 0; i--) {
            // StringIndexOutOfBoundsException 예외 발생 처리
            if (indices[i] < sb.length()) { // 문자열 범위 내 있는지 확인
                sb.deleteCharAt(indices[i]);
            }
        }

        return sb.toString();
    }
}
