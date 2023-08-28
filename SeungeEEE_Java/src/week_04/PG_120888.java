package week_04;

import java.util.Scanner;

public class PG_120888 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String answer = "";
		
		for(int i = 0; i < my_string.length(); i++) {
			if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
				answer += my_string.charAt(i);
			}
		}
		System.out.print(answer);
	}

}

// 프로그래머스 - 중복된 문자 제거 
/* class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
} */