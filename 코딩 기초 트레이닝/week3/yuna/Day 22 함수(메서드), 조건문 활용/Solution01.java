// 0 떼기

class Solution01 {
    public String solution(String n_str) {
        String answer = "";
        
        if (!n_str.startsWith("0"))
            answer = n_str;
        else {
            for (int i = 0; i < n_str.length(); i++)
                if (!n_str.substring(i, i+1).equals("0")) {
                    answer = n_str.substring(i);
                    break;
                }
        }
            
        return answer;
    }
}