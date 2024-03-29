package basic.week3.day24;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
    // 그림 확대
    public String[] solution(String[] picture, int k) {
//        List<String> list = new ArrayList<>();
//
//        for (int i = 0; i < picture.length; i++) {
//            String[] pic = picture[i].split("");
//            String str = "";
//
//            for (int j = 0; j < pic.length; j++) {
//                str += pic[j].repeat(k);
//            }
//
//            for (int j = 0; j < k; j++) {
//                list.add(str);
//            }
//        }
//
//        return list.toArray(new String[list.size()]);

        // ver 2
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                StringBuilder sb = new StringBuilder();

                for (int l = 0; l < picture[i].length(); l++) {
                    sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
                }

                answer[idx++] = sb.toString();
            }
        }

        return answer;
    }
}
