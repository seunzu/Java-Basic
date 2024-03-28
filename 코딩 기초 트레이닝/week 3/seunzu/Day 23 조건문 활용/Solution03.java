package basic.week3.day23;

public class Solution03 {
    // 정수 찾기
    public int solution(int[] num_list, int n) {
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] == n){
                return 1;
            }
        }

        return 0;
    }
}
