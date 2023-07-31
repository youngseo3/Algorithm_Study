package week_02;

import java.util.Scanner;

public class PG_120819 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		int [] answer = new int [2];
		
		answer[0] = money / 5500;
		answer[1] = money % 5500;
		
		scanner.close();
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
}

// 프로그래머스 
/* class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer [0] = money / 5500;
        answer [1] = money % 5500;
        
        return answer;
    }
} */
