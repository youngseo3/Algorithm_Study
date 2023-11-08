package week_03;

import java.util.Scanner;

public class PG_120837 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hp = sc.nextInt();
		int answer = 0;
		
		answer += (hp / 5);
		hp %= 5;
		
		answer += (hp / 3);
		hp %= 3;
		
		answer += (hp / 1);
		
		System.out.print(answer);
	}

}


// 프로그래머스 

/* class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += (hp / 5);
        hp %= 5;
        
        answer += (hp / 3);
        hp %= 3;
        
        answer += (hp / 1);
        
        return answer;
    }
} */