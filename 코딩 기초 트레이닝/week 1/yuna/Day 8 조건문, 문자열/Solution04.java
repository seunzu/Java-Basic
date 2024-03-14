// 9로 나눈 나머지

class Solution04 {
    public int solution(String number) {
        String[] arr = number.split("");
        
        int sum = 0;
        for (String s : arr)
            sum += Integer.parseInt(s);
        
        return sum % 9;
    }
}