// 부분 문자열인지 확인하기

class Solution05 {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            String str = my_string.substring(i);
            if (str.startsWith(target))
                answer = 1;
            else
                continue;
        }
        
        return answer;
    }
}