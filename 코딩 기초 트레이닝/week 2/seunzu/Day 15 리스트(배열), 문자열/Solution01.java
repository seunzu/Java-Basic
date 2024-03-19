package basic.week2.day15;

public class Solution01 {
    // 조건에 맞게 수열 변환하기 1
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
            }
        }

        return arr;
    }
}
