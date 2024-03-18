// 수열과 구간 쿼리1

class Solution05 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            for (int i = s; i <= e; i++)
                arr[i] = arr[i] + 1;
        }
        
        return answer;
    }
}