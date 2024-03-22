package basic.week2.day20;

import java.util.stream.IntStream;

public class Solution02 {
    // 배열 비교하기
    public int solution(int[] arr1, int[] arr2) {
        // ver1
//        int len1 = arr1.length;
//        int len2 = arr2.length;
//
//        int sum1 = 0;
//        int sum2 = 0;
//
//        if (len1 < len2) return -1;
//        else if (len1 > len2) return 1;
//        else {
//            for (int i = 0; i < len1; i++) {
//                sum1 += arr1[i];
//                sum2 += arr2[i];
//            }
//
//            if (sum1 == sum2) return 0;
//            else if (sum1 > sum2) return 1;
//            else return -1;
//        }

        // ver2
        int answer = Integer.compare(arr1.length, arr2.length);

        if (answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }
}
