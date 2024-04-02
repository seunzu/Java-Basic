// 최빈값 구하기
import java.util.*;

class Solution03 {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int max = array[array.length - 1];
        int[] count = new int[max + 1];
        
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        int m = 0, answer = 0;
        
        for (int i = 0; i < count.length; i++) {
            if (m < count[i]) {
                m = count[i];
                answer = i;
            } else if (m == count[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}