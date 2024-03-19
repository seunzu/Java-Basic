// 소문자로 바꾸기

class Solution02 {
    public String solution(String myString) {
        String answer = "";
        
        char[] strArray = myString.toCharArray();
        
        for (char c : strArray) {
            if (Character.isUpperCase(c))
                answer += Character.toLowerCase(c);
            else
                answer += c;
        }
        
        return answer;
    }
}