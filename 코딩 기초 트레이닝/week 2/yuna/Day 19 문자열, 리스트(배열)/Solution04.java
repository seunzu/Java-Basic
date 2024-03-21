// 배열 만들기6
import java.util.*;

class Solution04 {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stkList = new ArrayList<>();
        
        while (i < arr.length) {
            if (stkList.size() == 0)
                stkList.add(arr[i++]);
            else {
                if (stkList.get(stkList.size() - 1) == arr[i]) {
                    stkList.remove(stkList.size() - 1);
                    i++;
                } else
                    stkList.add(arr[i++]);
            }
        }
        
        int[] answer = new int[stkList.size()];
        
        if (stkList.size() == 0)
            answer = new int[] {-1};
        else {
            for (int j = 0; j < answer.length; j++)
                answer[j] = stkList.get(j);
        }
        System.out.println(stkList);
        
        return answer;
    }
}