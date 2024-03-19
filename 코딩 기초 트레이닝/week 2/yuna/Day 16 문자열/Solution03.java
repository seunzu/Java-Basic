// 배열에서 문자열 대소문자 변환하기

class Solution03 {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++)
            answer[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        
        return answer;
    }
}