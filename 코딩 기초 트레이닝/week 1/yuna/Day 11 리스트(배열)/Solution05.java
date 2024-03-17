// 가까운 1 찾기

class Solution05 {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1)
                return i;
        }
        
        return -1;
    }
}