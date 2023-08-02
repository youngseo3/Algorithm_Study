package week_02;

import java.util.Scanner;

public class PG_120820 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int answer = 0;
		
		answer = 2022 - age + 1;
		
		scanner.close();
		
		System.out.println(answer);
	}
}

// 프로그래머스 

/* class Solution {
    public int solution(int age) {
        int answer = 0;
        
        answer = 2022 - age + 1;
        
        return answer;
    }
} */
