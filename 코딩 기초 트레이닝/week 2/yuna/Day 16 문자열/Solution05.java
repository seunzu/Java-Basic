// 특정한 문자를 대문자로 바꾸기

class Solution05 {
    public String solution(String my_string, String alp) {
        String answer = my_string;
        
        if (my_string.contains(alp))
            answer = answer.replaceAll(alp, alp.toUpperCase());
        
        return answer;
    }
}