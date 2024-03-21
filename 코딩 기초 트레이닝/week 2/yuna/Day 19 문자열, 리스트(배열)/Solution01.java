// 세 개의 구분자

class Solution01 {
    public String[] solution(String myStr) {
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            
            if (c == 'a' || c == 'b' || c == 'c')
                myStr = myStr.replaceAll(myStr.substring(i, i + 1), "F");
        }
        
        String[] temp = myStr.split("F"); // 구분하기 위한 문자, 임의로 F로 지정
        
        String[] answer = {};
        
        if (temp.length == 0)
            answer = new String[] {"EMPTY"};
        else {
            int num = 0;
            for (int i = 0; i < temp.length; i++)
                if (!temp[i].equals(""))
                    num++;
            
            answer = new String[num];
            
            int n = 0;
            
            for (int i = 0; i < temp.length; i++)
                if (!temp[i].equals(""))
                    answer[n++] = temp[i];
        }
        
        return answer;
    }
}