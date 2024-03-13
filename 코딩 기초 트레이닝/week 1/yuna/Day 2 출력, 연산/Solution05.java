// 문자열 겹쳐쓰기

class Solution05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        
        return answer;
    }
}