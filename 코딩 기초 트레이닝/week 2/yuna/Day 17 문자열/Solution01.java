// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

class Solution01 {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = myString.length(); i >= 0; i--) {
            if (myString.substring(0, i).endsWith(pat)) {
                answer = myString.substring(0, i);
                break;
            }
        }
        
        return answer;
    }
}