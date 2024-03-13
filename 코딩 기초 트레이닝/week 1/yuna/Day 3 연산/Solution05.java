// 두 수의 연산값 비교하기

class Solution05 {
    public int solution(int a, int b) {
        int answer = 0;
        
        int strComb = Integer.parseInt("" + a + b);
        int strMult = 2 * a * b;
        
        if (strComb >= strMult)
            answer = strComb;
        else if (strComb < strMult)
            answer = strMult;
        
        return answer;
    }
}