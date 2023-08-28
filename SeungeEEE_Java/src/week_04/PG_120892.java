package week_04;

import java.util.Scanner;

public class PG_120892 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cipher = sc.nextLine();
		int code = sc.nextInt();
		
		String answer = "";
		String[] s = cipher.split("");
		
		for(int i = 0; i < s.length; i++) {
			if((i + 1) % code == 0) {
				answer += s[i];
			}
		}
		
		System.out.print(answer);
	}

}


// 프로그래머스 - 암호 해독 
/* class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] s = cipher.split("");
        
        for(int i = 0; i < s.length; i++) {
            if((i + 1) % code == 0) {
                answer += s[i];
            }
        }
        return answer;
    }
} */