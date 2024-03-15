package basic.week1.day6;

import java.util.Scanner;

public class Solution02 {
    // 수 조작하기 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String control = sc.next();

        Solution02 solution = new Solution02();
        int result = solution.solution(n, control);
        System.out.println(result);
    }

    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            if (c == 'w') n += 1;
            else if (c == 's') n -= 1;
            else if (c == 'd') n += 10;
            else if (c == 'a') n -= 10;
        }

        return n;
    }
}
