// 빈 배열에 추가, 삭제하기
import java.util.*;

class Solution03 {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> intArr = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++)
                    intArr.add(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; j++)
                    intArr.remove(intArr.size() - 1);
            }
        }
        
        int[] answer = new int[intArr.size()];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = intArr.get(i);
        
        return answer;
    }
}