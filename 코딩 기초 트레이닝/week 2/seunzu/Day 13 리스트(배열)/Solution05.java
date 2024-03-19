package basic.week2.day13;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {
    // n개 간격의 원소들
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
