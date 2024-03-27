// 주사위 게임1
import java.util.*;

class Solution04 {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean oddA = a % 2 == 0 ? false : true;
        boolean oddB = b % 2 == 0 ? false : true;
        
        if (oddA && oddB) answer = a * a + b * b;
        else if (!oddA && !oddB) answer = Math.abs(a - b);
        else answer = 2 * (a + b);
        
        return answer;
    }
}