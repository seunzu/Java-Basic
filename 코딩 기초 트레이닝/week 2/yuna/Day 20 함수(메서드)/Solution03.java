// 문자열 묶기
import java.util.*;

class Solution03 {
    public int solution(String[] strArr) {
        List<Integer> lenArr = new ArrayList<>(); // 문자열 길이를 담은 리스트
        
        for (String s : strArr)
            if (!lenArr.contains(s.length()))
                lenArr.add(s.length());
        
        Collections.sort(lenArr);
        
        int[] numArr = new int[lenArr.size()]; // 문자열 길이 별로 담은 개수
        
        for (int i = 0; i < numArr.length; i++) // 기본 0으로 세팅
            numArr[i] = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            int num = strArr[i].length() - 1;
            numArr[num]++;
        }
        
        int answer = 0;
        
        for (int i : numArr)
            if (i > answer)
                answer = i;
        
        return answer;
    }
}