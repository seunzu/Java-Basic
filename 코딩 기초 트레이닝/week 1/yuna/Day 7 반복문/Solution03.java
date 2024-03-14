// 카운트 업

class Solution03 {
    public int[] solution(int start_num, int end_num) {
        int numLength = end_num - start_num + 1;
        int[] answer = new int[numLength];
        
        for (int i = 0; i < numLength; i++)
            answer[i] = start_num + i;
        
        return answer;
    }
}