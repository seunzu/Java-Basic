package introduction.week4.day2;

public class Solution03 {
    // 분수의 덧셈
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = GCD(numer, denom);
        int[] answer = {numer / gcd, denom / gcd};

        return answer;
    }

    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return GCD(num2, num1 % num2);
    }
}
