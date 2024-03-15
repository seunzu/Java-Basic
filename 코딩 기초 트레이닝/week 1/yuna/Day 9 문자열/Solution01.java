// 배열 만들기5
import java.util.*;

class Solution01 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        
        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s+l));
            
            if (num > k)
                arr.add(num);
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = arr.get(i);
        
        return answer;
    }
}