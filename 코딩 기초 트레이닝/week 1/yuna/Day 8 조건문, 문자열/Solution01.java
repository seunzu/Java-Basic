// 간단한 논리 연산

class Solution01 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean result1 = (x1 == false && x2 == false) ? false : true;
        boolean result2 = (x3 == false && x4 == false) ? false : true;
        
        if (result1 == true && result2 == true)
            answer = true;
        else
            answer = false;
        
        return answer;
    }
}