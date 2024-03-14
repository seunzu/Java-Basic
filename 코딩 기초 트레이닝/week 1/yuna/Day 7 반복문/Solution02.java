// 배열 만들기2
import java.util.*;

class Solution02 {
    public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String num = "" + i;
            int len = 0;
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '0' || num.charAt(j) == '5')
                    len++;
            }
            
            if (num.length() == len) arr.add(i);
        }
        
        int arrNum = 0;
        
        if (arr.isEmpty()) {
            arrNum = 1;
            arr.add(-1);
        } else {
            arrNum = arr.size();
        }
                        
        int[] answer = new int[arrNum];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = arr.get(i);
                
        return answer;
    }
}

/* TODO: 이진법 활용해서 풀어보기 */