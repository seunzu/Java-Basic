// 배열의 길이를 2의 거듭제곱으로 만들기
import java.util.*;

class Solution01 {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int num = 0;
        
        while (true) {            
            if (len <= Math.pow(2, num)) break;
            num++;
        }
        
        if (Math.pow(2, num) - len == 0) return arr;
        
        int addNum = (int)Math.pow(2, num) - len;
        
        int[] answer = new int[arr.length + addNum];
        
        for (int i = 0; i < arr.length; i++)
            answer[i] = arr[i];
        
        return answer;
    }
}