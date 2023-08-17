package week_03;

import java.util.Scanner;

public class PG_120830 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		
		answer = ((n * 12000) + (k - (n/10)) * 2000);
		
		System.out.print(answer);
	}

}

// 프로그래머스 
/* class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer = ((n*12000) + (k - (n/10))*2000);
        
        return answer;
    }
} */