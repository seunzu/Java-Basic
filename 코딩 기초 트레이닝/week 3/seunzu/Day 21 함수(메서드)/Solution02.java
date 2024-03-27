package basic.week3.day21;

import java.util.Arrays;

public class Solution02 {
    // 전국 대회 선발 고사
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int sort[] = new int[rank.length];

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                sort[i] = rank[i];
            } else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(rank);

        for (int i = 0; i < sort.length; i++) {
            if (rank[0] == sort[i]) {
                answer += i * 10000;
            } else if (rank[1] == sort[i]) {
                answer += i * 100;
            } else if (rank[2] == sort[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
