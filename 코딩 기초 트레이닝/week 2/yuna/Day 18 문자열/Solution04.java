// 문자열 바꿔서 찾기

class Solution04 {
    public int solution(String myString, String pat) {
        String change = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A')
                change += "B";
            else
                change += "A";
        }
        
        if (change.contains(pat)) return 1;
        else return 0;
    }
}