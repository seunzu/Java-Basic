package basic.week2.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {
    // 빈 배열에 추가, 삭제하기
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
