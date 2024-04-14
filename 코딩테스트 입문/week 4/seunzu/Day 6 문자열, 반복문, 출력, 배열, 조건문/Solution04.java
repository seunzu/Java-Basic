package introduction.week4.day6;

public class Solution04 {
    // 문자 반복 출력하기
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i = 0; i < my_string.length(); i++){
            answer += str[i].repeat(n);
        }

        return answer;
    }
}
