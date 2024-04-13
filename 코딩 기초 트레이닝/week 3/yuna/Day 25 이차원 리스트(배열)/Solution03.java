// 정사각형으로 만들기
import java.util.*;

class Solution03 {
    public int[][] solution(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            List<Integer> tempArr = new ArrayList<>();
            
            for (int j = 0; j < arr[i].length; j++) {
                tempArr.add(arr[i][j]);
            }
            
            list.add(tempArr);
        }
        
        
        int row = arr.length;
        int col = arr[0].length;
        
        int differ = Math.abs(row-col);
        
        int[][] answer = {};
        
        if (row > col) {
            answer = new int[row][col + differ];
            
            for (int i = 0; i < differ; i++)
                for (int j = 0; j < list.size(); j++)
                    list.get(j).add(0);
        } else if (row < col) {
            answer = new int[row + differ][col];
            
            for (int i = 0; i < differ; i++) {
                List<Integer> addArr = new ArrayList<>();
                
                for (int j = 0; j < col; j++)
                    addArr.add(0);
                
                list.add(addArr);
            }
            
        } else return arr;
        
        for (int i = 0; i < list.size(); i++)
            for (int j = 0; j < list.get(i).size(); j++)
                answer[i][j] = list.get(i).get(j);
        
        return answer;
    }
}