// 덧셈식 출력하기
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}