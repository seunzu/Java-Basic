package introduction.week4.day8;

public class Solution02 {
    // 외계행성의 나이
    public String solution(int age) {
        String answer = "";

        // ver 1
        String ageStr = String.valueOf(age);
        for (int i = 0; i < ageStr.length(); i++) {
            char c = (char)(Integer.parseInt(String.valueOf(ageStr.charAt(i))) + 97);
            answer += c;
        }

        // ver 2
//        while (age > 0) {
//            char c = (char) (age % 10 + 97);
//            answer = c + answer;
//            age /= 10;
//        }
        return answer;

    }
}
