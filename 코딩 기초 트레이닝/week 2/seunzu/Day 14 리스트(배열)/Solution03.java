package basic.week2.day14;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {
    // 할 일 목록
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i])
                list.add(todo_list[i]);
        }

        return list.toArray(new String[0]);
    }
}
