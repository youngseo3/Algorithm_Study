package week_03;

import java.util.Scanner;

public class PG_120829 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int angle = sc.nextInt();
		int answer = 0;
		
		if (0 < angle && angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (90 < angle && angle < 180) {
			answer = 3;
		} else if (angle == 180) {
			answer = 4;
		}
		System.out.print(answer);
	}
}

// 프로그래머스 
/* class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
} */