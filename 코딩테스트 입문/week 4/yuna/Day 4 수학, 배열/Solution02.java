// 피자 나눠 먹기(2)

class Solution02 {
    public int solution(int n) {
        int answer = 1;
        
        while (true) {
            if ((6 * answer) % n == 0)
                break;
            answer++;
        }
        
        return answer;
    }
}