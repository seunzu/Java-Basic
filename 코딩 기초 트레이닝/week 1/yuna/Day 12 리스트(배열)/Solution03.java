// 배열 만들기3
import java.util.*;

class Solution03 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> num = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            int a1 = intervals[i][0];
            int b1 = intervals[i][1];
            
            for (int j = a1; j <= b1; j++)
                num.add(arr[j]);
        }
        
        int[] answer = new int[num.size()];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = num.get(i);
        
        return answer;
    }
}