// 5명씩

class Solution02 {
    public String[] solution(String[] names) {
        int owner = (names.length % 5 == 0) ? names.length / 5 : names.length / 5 + 1;
        
        String[] answer = new String[owner];
        
        int index = 0;
        for (int i = 0; i < names.length; i += 5) {
            answer[index] = names[i];
            index++;
        }
        
        return answer;
    }
}