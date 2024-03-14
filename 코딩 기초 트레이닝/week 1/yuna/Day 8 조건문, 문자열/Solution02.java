// 주사위 게임3
import java.util.*;

class Solution02 {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        List<Integer> diceNum = new ArrayList<>();
        
        for (int i : arr) {
            if (!diceNum.contains(i))
                diceNum.add(i);
        }
        
        int stage = 0;
        
        switch (diceNum.size()) {
            case 1:
                stage = 1;
                break;
            case 2:
                int s = distinction(a, b, c, d);
                if (s == 2) stage = 2;
                else stage = 3;
                break;
            case 3:
                diceNum.remove(Integer.valueOf(decision4(arr)));
                stage = 4;
                break;
            case 4:
                stage = 5;
                break;
                
        }
        
        int answer = 0;
        
        switch (stage) {
            case 1:
                answer = 1111 * diceNum.get(0);
                break;
            case 2:
                answer = (int)Math.pow(decision2(arr), 2);
                break;
            case 3:
                answer = (diceNum.get(0) + diceNum.get(1)) * Math.abs(diceNum.get(0) - diceNum.get(1));
                break;
            case 4:
                answer = diceNum.get(0) * diceNum.get(1);
                break;
            case 5:
                answer = arr[0];
                break;
        }
        
        return answer;
    }
    
    public int distinction(int a, int b, int c, int d) {
        if (a == b && b == c && c!= d) return 2;
        else if (a == b && b == d && a != c) return 2;
        else if (a == c && c == d && a != b) return 2;
        else if (b == c && c == d && a != b) return 2;
        else return 3;
        
    }
    
    public int decision2(int[] arr) {
        if (arr[0] == arr[1])
            return 10 * arr[0] + arr[3];
        else
            return 10 * arr[3] + arr[0];
    }
    
    public int decision4(int[] arr) {
        int remove = 0;
        int n = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (n == arr[i]) {
                remove = arr[i];
                return remove;
            } else n = arr[i];
        }
        
        return 0;
    }
}