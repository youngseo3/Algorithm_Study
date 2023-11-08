package week_04;

import java.util.Scanner;

public class PG_120898 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		int answer = 0;
		
		answer = message.length() * 2;
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 편지 

/* class Solution {
    public int solution(String message) {
        int answer = 0;
        
        answer = message.length() * 2;
        return answer;
    }
} */