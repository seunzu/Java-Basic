// 글자 이어 붙여 문자열 만들기

class Solution03 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for (int i : index_list)
            answer += my_string.charAt(i);
        
        return answer;
    }
}