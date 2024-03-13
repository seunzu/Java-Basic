// 대소문자 바꿔서 출력하기
import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        char[] strArray = a.toCharArray();
        
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(strArray[i]))
                answer += String.valueOf(Character.toLowerCase(strArray[i]));
            else if (Character.isLowerCase(strArray[i]))
                answer += String.valueOf(Character.toUpperCase(strArray[i]));
        }
        
        System.out.println(answer);
    }
}