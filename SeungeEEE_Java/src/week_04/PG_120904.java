package week_04;

public class PG_120904 {

}

// 프로그래머스 - 숫자 찾기 

/* class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] s = String.valueOf(num).split("");
        
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
} */