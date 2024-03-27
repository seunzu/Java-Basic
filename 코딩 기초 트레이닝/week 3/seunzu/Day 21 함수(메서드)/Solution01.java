package basic.week3.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution01 {
    // 뒤에서 5등 위로
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++)
            list.add(num_list[i]);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
