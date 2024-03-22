package basic.week2.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    // 세 개의 구분자
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return list.toArray(new String[0]);
        }
    }
}
