// 할 일 목록
import java.util.*;

class Solution03 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> todo = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false)
                todo.add(todo_list[i]);
        }
        
        String[] answer = new String[todo.size()];
        
        for (int i = 0; i < answer.length; i++)
            answer[i] = todo.get(i);
        
        return answer;
    }
}