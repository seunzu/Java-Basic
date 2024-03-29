package basic.week3.day24;

public class Solution01 {
    // 커피 심부름
    public int solution(String[] order) {
        int total = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].equals("anything")) {
                total += 4500;
            } else {
                total += 5000;
            }
        }

        return total;
    }
}
