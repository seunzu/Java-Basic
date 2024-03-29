package basic.week3.day24;

public class Solution04 {
    // l로 만들기
    public String solution(String myString) {
        // ver 1
        return myString.replaceAll("[a-k]", "l");

        // ver 2
//        String answer = "";
//
//        for (int i = 0; i < myString.length(); i++) {
//            if (myString.charAt(i) <= 'l') {
//                answer += "l";
//            } else {
//                answer += myString.charAt(i) + "";
//            }
//        }
//        return answer;
    }
}
