// A 강조하기

class Solution04 {
    public String solution(String myString) {
        String answer = myString.toLowerCase();
        
        for (int i = 0; i < answer.length(); i++) {
            if (answer.substring(i, i+1).equals("a"))
                answer = answer.replaceAll("a", "A");
        }
        
        return answer;
    }
}