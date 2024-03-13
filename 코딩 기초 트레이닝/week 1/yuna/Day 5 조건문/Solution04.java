// 원소들의 곱과 합

class Solution04 {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int numMult = 1;
        int numSum = 0;
        
        for (int i : num_list) {
            numMult *= i;
            numSum += i;
        }
                
        answer = (numMult < numSum*numSum) ? 1 : 0;
        
        return answer;
    }
}