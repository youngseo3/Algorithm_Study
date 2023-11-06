package week_04;

public class PG_120912 {

}

// 프로그래머스 - 7의 개수 

/* class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            String num = Integer.toString(array[i]);
            String[] s = num.split("");
            
            for(int j = 0; j < s.length; j++) {
                if(s[j].equals("7")) {
                    answer ++;
                }
            }
        }
        return answer;
    }
} */