package basic.week2.day17;

public class Solution01 {
    // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
    public String solution(String myString, String pat) {
        String answer = "";

        for (int i = myString.length() - 1; i >= 0 ; i--) {
            String substr = myString.substring(0, i + 1);
            if (substr.endsWith(pat)) {
                answer = substr;
                break;
            }
        }

        return answer;
    }
}
