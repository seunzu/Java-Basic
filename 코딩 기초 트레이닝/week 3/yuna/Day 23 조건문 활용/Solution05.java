// 날짜 비교하기
import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);

        return d1.isBefore(d2) ? 1 : 0;
    }
}