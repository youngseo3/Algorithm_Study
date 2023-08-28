package week_04;

import java.util.Arrays;

public class PG_120889 {
	public static void main(String[] args) {
		int [] sides = {99, 72, 222};
		int answer = 0;
		Arrays.sort(sides);
		
		if(sides[2] < (sides[0] + sides[1])) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 삼각형의 완성조건(1) 

/* import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        if(sides[2] < (sides[0] + sides[1])) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
} */