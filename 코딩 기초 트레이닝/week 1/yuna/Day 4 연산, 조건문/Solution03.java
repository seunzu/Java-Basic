// 홀짝에 따라 다른 값 반환하기

class Solution03 {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i+= 2) {
                answer += i;
            }
        } else if (n % 2 == 0) {
            for (int i = 0; i <= n; i+= 2) {
                answer += i*i;
            }
        }
        
        return answer;
    }
}