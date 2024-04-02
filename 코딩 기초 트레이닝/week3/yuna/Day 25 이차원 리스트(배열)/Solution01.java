// 정수를 나선형으로 배치하기

class Solution01 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        int startRow = 0, endRow = n-1; // 행
        int startCol = 0, endCol = n-1; // 열
        
        while (num <= n*n) {
            // 왼 -> 오
            for (int i = startCol; i <= endCol; i++) {
                answer[startRow][i] = num++;
            }
            startRow++;
            
            // 위 -> 아래
            for (int i = startRow; i <= endRow; i++) {
                answer[i][endCol] = num++;
            }
            endCol--;
            
            // 오 -> 왼
            for (int i = endCol; i >= startCol; i--) {
                answer[endRow][i] = num++;
            }
            endRow--;
            
            // 아래 -> 위
            for (int i = endRow; i >= startRow; i--) {
                answer[i][startCol] = num++;
            }
            startCol++;
        }
        
        return answer;
    }
}