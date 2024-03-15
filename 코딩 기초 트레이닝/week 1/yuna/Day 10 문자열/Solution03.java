// 문자열 뒤집기

class Solution03 {
    public String solution(String my_string, int s, int e) {
        String reverse = "";
        
        for (int i = e; i >= s; i--)
            reverse += my_string.substring(i, i + 1);
        
        return my_string.substring(0, s) + reverse + my_string.substring(e + 1);
    }
}