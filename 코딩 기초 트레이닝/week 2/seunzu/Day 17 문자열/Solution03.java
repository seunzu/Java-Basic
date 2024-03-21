package basic.week2.day17;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {
    // ad 제거하기
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
