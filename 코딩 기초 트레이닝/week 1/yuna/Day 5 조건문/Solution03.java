// 주사위 게임2

import java.util.*;

class Solution03 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int pow2 = (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        int pow3 = (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        
        if (a == b && b == c)
            answer = sum * pow2 * pow3;
        else if (a != b && a != c && b != c)
            answer = sum;
        else
            answer = sum * pow2;
        
        return answer;
    }
}