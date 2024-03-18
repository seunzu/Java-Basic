// 문자 개수 세기

class Solution01 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90)
                answer[my_string.charAt(i) - 65]++;
            else if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122)
                answer[my_string.charAt(i) - 71]++;
        }
        
        /* 대문자 idx : 0 - 25, 소문자 idx : 26 - 51 */
        
        return answer;
    }
}