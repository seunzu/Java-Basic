// 2의 영역

class Solution04 {
    public int[] solution(int[] arr) {
        int startIdx = 0, endIdx = arr.length - 1;
        
        for (int i : arr) {
            if (i == 2) break;
            
            startIdx++;
        }
        
        for (int i = endIdx; i >= 0; i--) {
            if (arr[i] == 2) break;
            
            endIdx--;
        }
        
        int len = endIdx - startIdx > 0 ? endIdx - startIdx + 1 : 1;
        
        int[] answer = new int[len];
                
        if (startIdx == arr.length)
            answer[0] = -1;
        else {
            for (int i = 0; i < answer.length; i++)
                answer[i] = arr[startIdx++];
        }
        
        return answer;
    }
}