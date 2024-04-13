// I로 만들기

class Solution04 {
    public String solution(String myString) {
        // ASCII a ~ k : 97 ~ 107
        
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            int c = (int)myString.charAt(i);
            if (c > 96 && c < 108)
                answer += "l";
            else
                answer += myString.substring(i, i + 1);
        }
        
        return answer;
    }
}