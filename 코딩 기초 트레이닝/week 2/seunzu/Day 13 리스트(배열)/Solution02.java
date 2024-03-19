package basic.week2.day13;

public class Solution02 {
    // 순서 바꾸기
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        // System.arraycopy(원본 배열, 원본 배열에서 복사 시작 인덱스,
        // 대상 배열, 대상 배열에서 복사 시작할 인덱스, 복사할 요소 수)
        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);

        return answer;
    }
}
