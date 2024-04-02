// 배열의 평균값

class Solution04 {
    public double solution(int[] numbers) {
        int sum = 0;
        
        for (int n : numbers)
            sum += n;
        
        double answer = (double)sum / numbers.length;
        return answer;
    }
}