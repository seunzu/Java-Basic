// 문자열 여러 번 뒤집기

class Solution05 {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            String reverse = "";
            for (int i = e; i >= s; i--) {
                reverse += my_string.charAt(i);
            }
            
            my_string = my_string.substring(0, s) + reverse + my_string.substring(e + 1);
        }
        
        return my_string;
    }
}