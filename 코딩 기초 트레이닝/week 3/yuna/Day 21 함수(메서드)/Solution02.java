// 전국 대회 선발 고사
import java.util.*;

class Solution02 {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> attend = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++)
            if (attendance[i])
                attend.add(rank[i]);
        
        Collections.sort(attend);
        
        int answer = 0;
        
        for (int i = 0; i < rank.length; i++) {
            if (attend.get(0) == rank[i])
                answer += 10000 * i;
            else if (attend.get(1) == rank[i])
                answer += 100 * i;
            else if (attend.get(2) == rank[i])
                answer += i;
        }
        
        return answer;
    }
}