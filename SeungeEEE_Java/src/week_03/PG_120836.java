package week_03;

import java.util.Scanner;

public class PG_120836 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count ++;
			}
		}
		answer = count;
		System.out.print(answer);
	}

}

// 프로그래머스 
/* class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count ++;
            }
        }
        answer = count;
        return answer;
    }
} */
