// 첫 번째로 나오는 음수

class Solution02 {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int n : num_list) {
            if (n >= 0) answer++;
            else break;
        }
        
        if (answer == num_list.length) answer = -1;
            
        return answer;
    }
}