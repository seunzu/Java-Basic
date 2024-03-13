// 수 조작하기1

class Solution02 {
    public int solution(int n, String control) {
        int answer = 0;
        
        for (int i = 0; i < control.length(); i++) {
            String index = control.substring(i, i+1);
            if (index.equals("w")) n += 1;
            else if (index.equals("s")) n -= 1;
            else if (index.equals("d")) n += 10;
            else if (index.equals("a")) n -= 10;
        }
        
        answer = n;
        
        return answer;
    }
}