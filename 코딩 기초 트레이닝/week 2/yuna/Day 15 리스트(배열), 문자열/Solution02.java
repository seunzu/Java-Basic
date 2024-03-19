// 조건에 맞게 수열 변환하기2
import java.util.*;

class Solution02 {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] compare = new int[arr.length];
        
        while (true) {
                        
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0)
                    compare[i] = arr[i] / 2;
                else if (arr[i] < 50 && arr[i] % 2 == 1)
                    compare[i] = arr[i] * 2 + 1;
                else
                    compare[i] = arr[i];
            }
            
            answer++;
                                    
            // if (answer == 3) break;
            
            if (Arrays.equals(arr, compare))
                break;
            else {
                arr = Arrays.copyOfRange(compare, 0, compare.length);
            }
            
        }
        
        // for (int i : compare)
        //     System.out.println(i);
        
        return answer - 1;
    }
}