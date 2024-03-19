// 대문자로 바꾸기

class Solution01 {
    public String solution(String myString) {
        String answer = "";
        
        char[] strArray = myString.toCharArray();
        
        for (char c : strArray)
            answer += Character.toUpperCase(c);
        
        return answer;
    }
}