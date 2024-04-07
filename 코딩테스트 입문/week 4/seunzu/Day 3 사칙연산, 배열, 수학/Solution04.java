package introduction.week4.day3;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
    // 짝수는 싫어요
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }
        return arr.stream().mapToInt(x -> x).toArray();
    }
}
