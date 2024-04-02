// 분수의 덧셈

class Solution03 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
                
        int num = gcd(numer, denom);
        
        answer[0] = numer / num;
        answer[1] = denom / num;
        
        return answer;
    }
    
    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        
        return gcd(num2, num1 % num2);
    }
}