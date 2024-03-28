package basic.week3.day22;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
    // 배열의 원소 삭제하기
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }

//        int[] answer = new int[list.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//
//        return answer;

        return list.stream().mapToInt(i -> i).toArray();
    }
}
