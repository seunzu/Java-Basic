// 글자 지우기
import java.util.*;

class Solution03 {
    public String solution(String my_string, int[] indices) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++)
            arr.add(Integer.toString(i));
        
        for (int i = 0; i < indices.length; i++)
            arr.remove(Integer.toString(indices[i]));
        
        String answer = "";
        
        for (int i = 0; i < arr.size(); i++)
            answer += my_string.charAt(Integer.parseInt(arr.get(i)));
        
        return answer;
    }
}