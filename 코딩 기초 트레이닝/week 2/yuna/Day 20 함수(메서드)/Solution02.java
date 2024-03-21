// 배열 비교하기

class Solution02 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length == arr2.length) {
            int sum1 = 0;
            int sum2 = 0;
            
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
                    
            if (sum1 > sum2) answer = compare("arr1");
            else if (sum1 < sum2) answer = compare("arr2");
            else answer = compare("same");
            
        } else {
            answer = arr1.length > arr2.length ? compare("arr1") : compare("arr2");
        }
        
        return answer;
    }
    
    public int compare(String bigger) {
        if (bigger.equals("arr1"))
            return 1;
        else if (bigger.equals("arr2"))
            return -1;
        else
            return 0;
    }
}