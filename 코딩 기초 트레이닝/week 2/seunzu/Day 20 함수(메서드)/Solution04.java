package basic.week2.day20;

public class Solution04 {
    // 배열의 길이에 따라 다른 연산하기
    public int[] solution(int[] arr, int n) {
        // ver1
        int len = arr.length;

//        if (len % 2 != 0) {
//            for(int i = 0; i < len; i += 2) {
//                arr[i] += n;
//            }
//        } else {
//            for (int i = 1; i < len; i += 2) {
//                arr[i] += n;
//            }
//        }

        // ver2
        for (int i = len % 2 == 0 ? 1 : 0; i >= 0; i -= 2) {
            arr[i] += n;
        }

        return arr;
    }
}
