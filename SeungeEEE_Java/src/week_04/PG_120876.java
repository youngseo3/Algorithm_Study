package week_04;

public class PG_120876 {

}

// 프로그래머스 - 겹치는 선분의 길이 

/* class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];
        
        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                arr[j] ++;
            }
        }
        
        for(int i = 0; i < 200; i++) {
            if(arr[i] > 1) {
                answer ++;
            }
        }
        
        return answer;
    }
} */