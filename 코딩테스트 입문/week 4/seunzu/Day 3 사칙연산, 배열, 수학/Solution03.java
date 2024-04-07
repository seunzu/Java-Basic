package introduction.week4.day3;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {
    // 최빈값 구하기
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount){
                maxCount = count;
                answer = number;
            }
            else if (count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
