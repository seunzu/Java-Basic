package basic.week2.day20;

import java.util.Arrays;

public class Solution01 {
    // 배열의 길이를 2의 거듭제곱으로 만들기
    public int[] solution(int[] arr) {
        // ver1
//        int len = arr.length;
//        int tmp = 1;
//
//        while (tmp < len) tmp *= 2;
//
//        int[] answer = new int[tmp];
//
//        for (int i = 0; i < len; i++) answer[i] = arr[i];
//
//        return answer;

        // ver2
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
