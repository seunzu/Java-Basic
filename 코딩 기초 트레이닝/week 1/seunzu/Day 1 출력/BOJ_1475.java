package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while (N > 0) {
            arr[N % 10]++;
            N /= 10;
        }

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i ==9)
                continue;

            answer = Math.max(answer, arr[i]);
        }

        answer = Math.max(answer, (arr[6] + arr[9] + 1) / 2);
        System.out.println(answer);
    }
}
