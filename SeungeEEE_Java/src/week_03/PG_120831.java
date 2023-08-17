package week_03;

import java.util.Scanner;

public class PG_120831 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		System.out.print(answer);
	}
}

// 프로그래머스 
/* class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
} */
