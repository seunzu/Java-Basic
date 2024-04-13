// 그림 확대

class Solution02 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int num = 0;
        
        for (int i = 0; i < picture.length; i++) {
            String enlarge = "";
            
            for (int j = 0; j < picture[i].length(); j++) {
                enlarge += picture[i].substring(j, j+1).repeat(k);
            }
            
            for (int j = 0; j < k; j++)
                answer[num++] = enlarge;
        }
        
        
        return answer;
    }
}