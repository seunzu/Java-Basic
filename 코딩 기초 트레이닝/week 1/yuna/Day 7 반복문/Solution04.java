// 콜라츠 수열 만들기
import java.util.*;

class Solution04 {
    public int[] solution(int n) {
        List<Integer> numList = new ArrayList<>();
        numList.add(n);
        
        while(n != 1) {            
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            
            numList.add(n);
            
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = numList.get(i);
        
        return answer;
    }
}