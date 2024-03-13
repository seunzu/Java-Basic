// 이어 붙인 수

class Solution05 {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "", odd= "";
                
        for (int i : num_list) {
            if (i % 2 == 0)
                even += i;
            else if (i % 2 == 1)
                odd += i;
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return answer;
    }
}