package basic.week2.day16;

public class Solution03 {
    // 배열에서 문자열 대소문자 변환하기
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return strArr;
    }
}
