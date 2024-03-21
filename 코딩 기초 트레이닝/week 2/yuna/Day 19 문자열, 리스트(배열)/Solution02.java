// 배열의 원소만큼 추가하기

class Solution02 {
    public int[] solution(int[] arr) {
        int sum = 0;
        
        for (int i : arr)
            sum += i;
        
        int[] answer = new int[sum];
        
        int num = 0;
        for (int i : arr) {
            for (int j = 0; j < i; j++)
                answer[num++] = i;
        }
        
        return answer;
    }
}