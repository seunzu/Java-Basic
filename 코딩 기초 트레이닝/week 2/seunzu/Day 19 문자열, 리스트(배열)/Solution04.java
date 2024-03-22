package basic.week2.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
    // 배열 만들기 6
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (!stk.isEmpty() && stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        return stk.stream().mapToInt(i -> i).toArray();
    }
}
