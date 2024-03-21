package basic.week2.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {
    // 문자열 잘라서 정렬하기
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();

        for (String str : arr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        String[] result = list.toArray(new String[list.size()]);
        Arrays.sort(result);

        return result;
    }
}
