package basic.week1.day8;

import java.util.Scanner;

public class Solution04 {
    // 9로 나눈 나머지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        Solution04 solution = new Solution04();
        int result = solution.solution(number);
        System.out.println(result);
    }

    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
//            answer += Character.getNumericValue(number.charAt(i));
            answer += number.charAt(i) - '0';
        }
        return answer % 9;
    }
}
