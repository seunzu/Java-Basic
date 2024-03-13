// 수열과 구간 쿼리3

class Solution04 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int i = 0; i < queries.length; i++) {
            int temp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temp;
        }
        
        return answer;
    }
}