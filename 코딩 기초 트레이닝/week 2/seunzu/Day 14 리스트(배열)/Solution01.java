package basic.week2.day14;

public class Solution01 {
    // 홀수 vs 짝수
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) even += num_list[i];
            else odd += num_list[i];
        }

        if (even >= odd) return even;
        else return odd;
    }
}
