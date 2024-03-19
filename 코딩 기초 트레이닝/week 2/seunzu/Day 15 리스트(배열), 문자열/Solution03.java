package basic.week2.day15;

public class Solution03 {
    // 1로 만들기
    public int solution(int[] num_list) {
        int cnt = 0;

        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                num_list[i] /= 2;
                cnt++;
            }
        }

        return cnt;
    }
}
