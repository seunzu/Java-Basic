// 간단한 식 계산하기

class Solution04 {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        
        int a = Integer.parseInt(str[0]);
        String op = str[1];
        int b = Integer.parseInt(str[2]);
        
        int answer = 0;
        
        switch (op) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        
        return answer;
    }
}