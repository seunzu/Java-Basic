// ad 제거하기
import java.util.*;

class Solution03 {
    public String[] solution(String[] strArr) {
        List<String> arr = new ArrayList<>();
        
        for (String s : strArr)
            if (!s.contains("ad"))
                arr.add(s);
        
        String[] answer = new String[arr.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = arr.get(i);
        
        return answer;
    }
}