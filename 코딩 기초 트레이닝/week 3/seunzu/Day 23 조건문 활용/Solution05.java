package basic.week3.day23;

public class Solution05 {
    // 날짜 비교하기
    public int solution(int[] date1, int[] date2) {
        // ver 1
//        if (date1[0] != date2[0]){
//            return date1[0] < date2[0] ? 1 : 0;
//        }
//        if (date1[1] != date2[1]) {
//            return date1[1] < date2[1] ? 1 : 0;
//        }
//        if (date1[2] != date2[2]) {
//            return date1[2] < date2[2] ? 1 : 0;
//        }

//        return 0;

        // ver 2
        for (int i = 0; i < 3; i++) {
            if (date1[i] != date2[i]) {
                return date1[i] < date2[i] ? 1 : 0;
            }
        }

        return 0;
    }
}
