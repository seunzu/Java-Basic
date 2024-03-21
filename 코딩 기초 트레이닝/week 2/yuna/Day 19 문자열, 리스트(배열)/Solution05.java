// 무작위로 K개의 수 뽑기
import java.util.*;

class Solution05 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        List<Integer> numList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!numList.contains(arr[i]))
                numList.add(arr[i]);
        }
        
        int s = k - numList.size();
                        
        if (numList.size() < k) {
            for (int i = 0; i < s; i++)
                numList.add(-1);
        }
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = numList.get(i);
        
        return answer;
    }
}