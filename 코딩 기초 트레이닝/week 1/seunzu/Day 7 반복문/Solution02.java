package basic.week1.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution02 {
    // 배열 만들기 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        Solution02 solution = new Solution02();
        int[] result = solution.solution(l, r);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String strNum = String.valueOf(i); // Integer.toString(i)
            String[] strNumList = strNum.split((""));

            int cnt = 0;
            for (int j = 0; j < strNumList.length; j++) {
                if(strNumList[j].equals("0") || strNumList[j].equals("5")) {
                    cnt++;
                }
            }

            if (cnt == strNumList.length) {
                list.add(i);
            }
        }

        // ArrayList -> int 배열
        answer = list.stream().mapToInt(i -> i).toArray();
//        answer = list.stream().mapToInt(Integer::intValue).toArray();

        if (answer.length == 0) {
            answer = new int[]{-1};
            return answer;
        }

        return answer;
    }
}
