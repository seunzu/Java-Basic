package basic.week2.day14;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
    // 5명씩
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            list.add(names[i]);
        }

        return list.toArray(new String[0]);
    }
}
