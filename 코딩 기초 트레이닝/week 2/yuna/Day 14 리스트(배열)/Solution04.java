// n보다 커질 때까지 더하기

class Solution04 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int num : numbers) {
            answer += num;
            
            if (answer > n) {
                break;
            }
        }
        
        return answer;
    }
}