package basic.week3.day25;

public class Solution01 {
    // 정수를 나선형으로 배치하기
    public int[][] solution(int n) {
        // ver 1
//        int[][] arr = new int[n][n];
//
//        int number = 1;
//        int x = 0, y = -1;
//        int direction = 1;
//
//        while (n > 0) {
//            for (int i = 0; i < n; i++) {
//                y += direction;
//                arr[x][y] = number++;
//            }
//            n--;
//
//            for (int i = 0; i < n; i++) {
//                x += direction;
//                arr[x][y] = number++;
//            }
//            direction *= -1;
//        }
//
//        return arr;


        // ver 2
        int[][] answer = new int[n][n];

        int num = 1;
        int x = 0, y = 0;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int direction = 0;

        while (num <= n * n) {
            answer[x][y] = num++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
}
