// 피자 나눠 먹기(1)

class Solution01 {
    public int solution(int n) {
        int answer = n % 7 > 0 ? n / 7 + 1 : n / 7;
        return answer;
    }
}