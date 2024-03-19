package basic.week2.day15;

public class Solution02 {
    // 조건에 맞게 수열 변환하기 2
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int[] newArr = new int[arr.length];

        while (cnt != arr.length) {
            cnt = 0;
            newArr = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }

                if (arr[i] == newArr[i]) cnt++;
            }
            answer++;
        }

        return answer - 1;
    }
}
