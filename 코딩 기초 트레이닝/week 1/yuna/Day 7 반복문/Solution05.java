// 배열 만들기4
import java.util.*;

class Solution05 {
    public int[] solution(int[] arr) {
        List<Integer> numArr = new ArrayList<>();
        
        int i = 0;
        
        while (i < arr.length) {
            if (numArr.isEmpty()) {
                numArr.add(arr[i]);
                i++;
            } else {
                if (numArr.get(numArr.size() - 1) < arr[i]) {
                    numArr.add(arr[i]);
                    i++;
                } else {
                    numArr.remove(numArr.get(numArr.size() - 1));
                }
                
            }
        }
        
        int[] stk = new int[numArr.size()];
        
        for (int j = 0; j < stk.length; j++)
            stk[j] = numArr.get(j);
        
        return stk;
    }
}