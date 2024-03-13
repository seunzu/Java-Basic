// 등차수열의 특정한 항만 더하기

class Solution02 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] seq = new int[included.length];
        
        for (int i = 0; i < included.length; i++) {
            seq[i] = a + i * d;
            
            if (included[i] == true)
                answer += seq[i];
        }        
        
        return answer;
    }
}