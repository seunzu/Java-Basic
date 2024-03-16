package basic.week1.day8;

import java.util.Scanner;

public class Solution03 {
    // 글자 이어 붙여 문자열 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int n = sc.nextInt();

        int[] index_list = new int[n];

        for (int i = 0; i < n; i++) {
            index_list[i] = sc.nextInt();
        }

        Solution03 solution = new Solution03();
        String result = solution.solution(my_string, index_list);
        System.out.println(result);
    }

    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }

        return answer;
    }
}
