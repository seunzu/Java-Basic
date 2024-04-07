package introduction.week4.day4;

public class Solution04 {
    // 배열의 평균값
    public double solution(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return (double)sum / numbers.length;
    }
}
