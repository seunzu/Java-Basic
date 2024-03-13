// 수열과 구간 쿼리2

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 0;
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            ArrayList<Integer> max = new ArrayList<Integer>();
            
            for (int i = s; i <= e; i++) {
                if (arr[i] > k)
                    max.add(arr[i]);
            }
            
            if (!max.isEmpty()) {
                int min = max.get(0);
                for (int n : max) {
                    if (n < min) min = n;
                }
                
                answer[num++] = min;
            } else {
                answer[num++] = -1;
            }
        
        }
        

        return answer;
    }
}