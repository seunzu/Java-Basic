package introduction.week4.day3;

import java.util.Arrays;

public class Solution02 {
    // 중앙값 구하기
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
