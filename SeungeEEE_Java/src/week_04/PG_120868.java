package week_04;

public class PG_120868 {

}

// 프로그래머스 - 삼각형의 완성 조건(2)

/* import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];
        
        int lowRange = max - min;
        int highRange = max + min;
        
        answer = highRange - lowRange - 1;
        
        return answer;
    }
} */