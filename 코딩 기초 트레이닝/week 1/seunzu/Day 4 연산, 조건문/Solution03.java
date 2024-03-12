package basic.week1.day4;

import java.util.Scanner;

public class Solution03 {
    // 홀짝에 따라 다른 값 반환하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution03 solution = new Solution03();

        int result = solution.solution(n);
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                answer += i*i;
            }
        }
        return answer;
    }
}
