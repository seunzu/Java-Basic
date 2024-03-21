package basic.week2.day17;

public class Solution02 {
    // 문자열이 몇 번 등장하는지 세기
    public int solution(String myString, String pat) {
        int cnt = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                cnt++;
            }
        }

        return cnt;
    }
}
