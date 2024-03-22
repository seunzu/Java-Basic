package basic.week2.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution05 {
    // 뒤에서 5등까지
    public int[] solution(int[] num_list) {
        // ver 1
//        List<Integer> list = new ArrayList<>();
//
//        Arrays.sort(num_list);
//
//        for (int i = 0; i < 5; i++) list.add(num_list[i]);
//
//        return list.stream().mapToInt(i -> i).toArray();

        // ver 2
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
