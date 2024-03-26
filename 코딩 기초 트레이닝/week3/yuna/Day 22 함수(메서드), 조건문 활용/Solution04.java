// 배열의 원소 삭제하기
import java.util.*;

class Solution04 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> numArr = new ArrayList<>();
               
        int add = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    add = 0;
                    break;
                } else {
                    add = arr[i];
                }
            }
            
            if (add != 0) numArr.add(add);
        }
        
        int[] answer = new int[numArr.size()];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = numArr.get(i);
        
        return answer;
    }
}