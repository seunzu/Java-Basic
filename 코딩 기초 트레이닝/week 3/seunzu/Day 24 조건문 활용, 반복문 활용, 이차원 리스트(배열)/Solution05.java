package basic.week3.day24;

public class Solution05 {
    // 특별한 이차원 배열 1
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) answer[i][j] = 1;
            }
        }

        return answer;
    }
}
