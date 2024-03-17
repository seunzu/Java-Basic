package basic.week1.day10;

import java.util.Scanner;

public class Solution02 {
    // 접두사인지 확인하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String is_prefix = sc.next();

        Solution02 solution = new Solution02();
        int result = solution.solution(my_string, is_prefix);
        System.out.println(result);
    }

    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        }

        return 0;
    }
}
