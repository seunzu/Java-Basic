package basic.week2.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
    // 배열의 원소만큼 추가하기
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}
