// 중앙값 구하기
import java.util.*;

class Solution02 {

    public int solution(int[] array) {
        int middle = array.length / 2;
        
        Arrays.sort(array);
        
        return array[middle];
    }
}