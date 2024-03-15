// 세로 읽기

class Solution {
    public String solution(String my_string, int m, int c) {
        String[] strArr = new String[my_string.length() / m];
        
        int n = 0;
        for (int i = 0; i < my_string.length(); i += m)
            strArr[n++] = my_string.substring(i, i + m);
                
        String answer = "";
        
        for (int i = 0; i < strArr.length; i++)
            answer += strArr[i].substring(c - 1, c);
        
        return answer;
    }
}