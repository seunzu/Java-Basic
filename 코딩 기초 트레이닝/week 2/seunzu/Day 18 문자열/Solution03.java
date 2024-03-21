package basic.week2.day18;

public class Solution03 {
    // 간단한 식 계산하기
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");

        int a = Integer.parseInt(arr[0]);
        String op = arr[1];
        int b = Integer.parseInt(arr[2]);

        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else {
            return 0;
        }
    }
}
