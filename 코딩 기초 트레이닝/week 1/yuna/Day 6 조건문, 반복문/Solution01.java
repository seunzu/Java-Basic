// 마지막 두 원소

class Solution01 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int end1 = num_list[num_list.length - 1];
        int end2 = num_list[num_list.length - 2];
        
        answer[answer.length - 1] = (end1 > end2) ? end1 - end2 : end1 * 2;
        
        return answer;
    }
}