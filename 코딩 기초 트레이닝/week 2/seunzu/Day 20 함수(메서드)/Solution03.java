package basic.week2.day20;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {
    // 문자열 묶기
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
