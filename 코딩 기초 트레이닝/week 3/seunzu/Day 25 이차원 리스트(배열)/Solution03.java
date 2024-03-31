package basic.week3.day25;

public class Solution03 {
    // 정사각형으로 만들기
    public int[][] solution(int[][] arr) {
        // ver 1
//        int row = arr.length;
//        int col = arr[0].length;
//
//        if (row > col) {
//            int[][] temp = new int[row][row];
//
//            for (int i = 0; i < row; i++) {
//                for (int j = 0; j < col; j++) {
//                    temp[i][j] = arr[i][j];
//                }
//
//                temp[i][col] = 0;
//            }
//            return temp;
//        } else if (col > row) {
//            int[][] temp = new int[col][col];
//
//            for (int i = 0; i < col; i++) {
//                for (int j = 0; j < row; j++) {
//                    temp[j][i] = arr[j][i];
//                }
//
//                temp[row][i] = 0;
//            }
//
//            return temp;
//        } else {
//            return arr;
//        }

        // ver 2
        int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }
        return array;
    }
}
