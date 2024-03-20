// 문자열 잘라서 정렬하기
import java.util.*;

class Solution02 {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        Arrays.sort(strArr);
        
        // 공백 제거 필요 (split하면 "", "", "", "a" 이런식)
        List<String> str = new ArrayList<>();
        
        for (String s : strArr)
            if (!s.equals(""))
                str.add(s);
        
        String[] answer = new String[str.size()];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = str.get(i);
    
        return answer;
    }
}