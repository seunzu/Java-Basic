// 부분 문자열

class Solution01 {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        for (int i = 0; i <= (str2.length() - str1.length()); i++) {
            String temp = str2.substring(i, i + str1.length());
            
            if (temp.equals(str1))
                answer = 1;
        }
        
        return answer;
    }
}