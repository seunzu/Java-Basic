// x 사이의 개수
import java.util.*;

class Solution01 {
    public int[] solution(String myString) {
        String[] numArr = myString.split("x");
        List<Integer> list = new ArrayList<>();
        
        for (String str : numArr) {
            if (str.equals(""))
                list.add(0);
            else
                list.add(str.length());
        }
        
        if (myString.endsWith("x"))
            list.add(0);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}