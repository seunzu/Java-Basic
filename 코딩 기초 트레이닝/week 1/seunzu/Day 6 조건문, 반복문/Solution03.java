package basic.week1.day6;

import java.util.Scanner;

public class Solution03 {
    // 수 조작하기 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numLog = new int[n];

        for (int i = 0; i < n; i++) {
            numLog[i] = sc.nextInt();
        }

        Solution03 solution = new Solution03();
        String result = solution.solution(numLog);
        System.out.println(result);
    }

    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            switch(numLog[i-1] - numLog[i]){
                case -1 : answer += 'w'; break;
                case 1 : answer += 's'; break;
                case -10 : answer += 'd'; break;
                case 10 : answer += 'a'; break;
            }
        }

        return answer;
    }
}

