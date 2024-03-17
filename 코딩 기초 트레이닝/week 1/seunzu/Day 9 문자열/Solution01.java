package basic.week1.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution01 {
    // 배열 만들기 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        String[] intStrs = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            intStrs[i] = sc.next();
        }

        int k = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();

        Solution01 solution = new Solution01();
        int[] result = solution.solution(intStrs, k, s, l);
        System.out.println(result);
    }

    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for(String str : intStrs) {
            int n = Integer.parseInt(str.substring(s, s + l));
            if(n > k) list.add(n);
        }

//        int[] answer = new int[list.size()];
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//
//        return answer;

        return list.stream().mapToInt(i -> i).toArray();
    }
}
