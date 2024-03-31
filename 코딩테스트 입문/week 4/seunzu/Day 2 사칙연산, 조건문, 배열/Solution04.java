package introduction.week4.day2;

public class Solution04 {
    // 배열 두배 만들기
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        return numbers;
    }
}
