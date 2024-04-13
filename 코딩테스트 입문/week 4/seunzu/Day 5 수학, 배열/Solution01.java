package introduction.week4.day5;

public class Solution01 {
    // 옷가게 할인 받기
    public int solution(int price) {
        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);
        return price;
    }
}
