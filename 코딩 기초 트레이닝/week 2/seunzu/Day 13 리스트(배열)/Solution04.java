package basic.week2.day13;

import java.util.Arrays;

public class Solution04 {
    // n번째 원소까지
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}