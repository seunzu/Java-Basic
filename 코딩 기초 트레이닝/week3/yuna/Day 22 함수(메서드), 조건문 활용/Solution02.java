// 두 수의 합
import java.math.BigInteger;

class Solution02 {
    public String solution(String a, String b) {
        try {
            BigInteger intA = new BigInteger(a);
            BigInteger intB = new BigInteger(b);
            BigInteger sum = intA.add(intB);
            
            return sum.toString();
        } catch (Exception e) { // String이 유효한 숫자가 아니라면 Exception 발생
            System.out.println("Exception : " + e);
            return "Error";
        }
    }
}