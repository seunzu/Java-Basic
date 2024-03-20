// 공백으로 구분하기2

class Solution05 {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        
        int num = 0;
        
        for (String s : str)
            if (!s.equals("")) num++;
        
        String[] answer = new String[num];
        
        int idx = 0;
        
        for (String s : str)
            if (!s.equals(""))
                answer[idx++] = s;
        
        return answer;
    }
}