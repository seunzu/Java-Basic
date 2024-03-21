// 배열의 길이에 따라 다른 연산하기

class Solution04 {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        
        int num = arr.length % 2 == 0 ? 1 : 0;
        
        for (int i = num; i < arr.length; i += 2) {
            answer[i] = arr[i] + n;
        }
        
        return answer;
    }
}