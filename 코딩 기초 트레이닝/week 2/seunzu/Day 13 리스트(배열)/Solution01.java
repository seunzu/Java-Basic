package basic.week2.day13;

import java.util.Arrays;

public class Solution01 {
    // n번째 원소부터
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
