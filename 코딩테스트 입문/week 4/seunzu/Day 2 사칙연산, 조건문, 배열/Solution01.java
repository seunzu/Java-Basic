package introduction.week4.day2;

public class Solution01 {
    // 두 수의 나눗셈
    public int solution(int num1, int num2) {
        double answer = (double) num1 / (double) num2;
        return (int) (answer * 1000);
    }
}
