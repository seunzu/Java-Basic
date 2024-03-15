// 접미사 배열
import java.util.Arrays;

class Solution04 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = my_string.substring(i);
        
        Arrays.sort(answer);
        
        return answer;
    }
}