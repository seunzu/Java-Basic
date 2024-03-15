package basic.week1.day5;

import java.util.Scanner;

public class Solution02 {
    // 등차수열의 특정한 항만 더하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String includedString = sc.next();

        boolean[] included = new boolean[includedString.length()];

        for (int i = 0; i < includedString.length(); i++) {
            included[i] = includedString.charAt(i) == '1';
        }

        Solution02 solution = new Solution02();

        int result = solution.solution(a, b, included);
        System.out.println(result);
    }

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer +=  a + (d * i);
            }
        }

        return answer;
    }
}
