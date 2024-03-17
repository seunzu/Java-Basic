package basic.week1.day9;

import java.util.Scanner;

public class Solution05 {
    // 접미사인지 확인하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String is_suffix = sc.next();

        Solution05 solution = new Solution05();
        int result = solution.solution(my_string, is_suffix);
        System.out.println(result);
    }

    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) {
            return 1;
        }

        return 0;
    }
}
