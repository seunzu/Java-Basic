package basic.week2.day14;

public class Solution05 {
    // 수열과 구간 쿼리 1
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }
}
