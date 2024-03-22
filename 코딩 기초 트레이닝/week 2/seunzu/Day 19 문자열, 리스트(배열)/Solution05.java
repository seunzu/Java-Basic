package basic.week2.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {
    // 무작위로 K개의 수 뽑기
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }

            if (list.size() == k) {
                break;
            }
        }

        while (list.size() < k) {
            list.add(-1);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
