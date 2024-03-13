// 문자 리스트를 문자열로 변환하기

class Solution02 {
    public String solution(String[] arr) {
        String answer = "";
        
        for (String s : arr)
            answer += s;
        
        return answer;
    }
}