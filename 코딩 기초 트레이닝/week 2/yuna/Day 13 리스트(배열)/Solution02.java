// 순서 바꾸기

class Solution02 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int front = num_list.length - n;
        int back = n;
        
        for (int i = 0; i < front; i++) {
            answer[i] = num_list[n];
            n++;
        }
        
        for (int i = front; i < answer.length; i++) {
            answer[i] = num_list[num_list.length - n];
            n--;
        }
        
        return answer;
    }
}