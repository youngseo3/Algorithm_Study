package week_04;

import java.util.Scanner;

public class PG_120849 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String my_string = sc.nextLine();
		String answer = my_string;
		String [] vowels = {"a", "e", "i", "o", "u"};
		
		for(String v: vowels) {
			answer = answer.replaceAll(v, "");
		}
		System.out.print(answer);
	}

}

// 프로그래머스 
/* class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String [] vowels = {"a", "e", "i", "o", "u"};
        
        for(String v: vowels) {
            answer = answer.replaceAll(v, "");
        }
        return answer;
    }
} */