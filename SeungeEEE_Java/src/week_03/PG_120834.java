package week_03;

import java.util.Scanner;

public class PG_120834 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String answer = "";
		String temp = Integer.toString(age);
		for (int i = 0; i < temp.length(); i++) {
			answer += (char)((char)temp.charAt(i) + 49);
		}
		
		System.out.print(answer);
	}

}
// 프로그래머스 

/* class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = Integer.toString(age);
        for (int i = 0; i < temp.length(); i++) {
            answer += (char)((char)temp.charAt(i) + 49);
        }
        return answer;
    }
} */