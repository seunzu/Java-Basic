// 원하는 문자열 찾기

class Solution05 {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        
        answer = str.contains(patStr) ? 1 : 0;
        
        return answer;
    }
}