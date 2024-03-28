package basic.week3.day22;

import java.math.BigInteger;

public class Solution02 {
    // 두 수의 합
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        BigInteger sum = A.add(B);

        return sum.toString();
    }
}
