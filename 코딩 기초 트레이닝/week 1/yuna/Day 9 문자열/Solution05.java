// 접미사인지 확인하기
import java.util.*;

class Solution05 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        String[] suffixArr = new String[my_string.length()];
        
        for (int i = 0; i < suffixArr.length; i++) {
            suffixArr[i] = my_string.substring(i);
        }
        
        for (String s : suffixArr)
            if (s.equals(is_suffix))
                answer = 1;
        
        return answer;
    }
}