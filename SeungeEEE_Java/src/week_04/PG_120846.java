package week_04;

import java.util.Scanner;

public class PG_120846 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			count = 0;
			for(int j = 1; j<= i; j++) {
				if(i % j == 0) {
					count ++;
				}
			} if (count >= 3) {
				answer ++;
			}
		}
		System.out.print(answer);
	}

}

// 프로그래머스

/* class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count ++;
                }
            } if (count >= 3) {
                answer ++;
            }
        }
        return answer;
    }
} */