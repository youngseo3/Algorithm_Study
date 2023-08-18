package week_03;

import java.util.Scanner;

public class PG_120838 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		String answer = " ";
		String [] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String [] morse;
		
		morse = letter.split("");
		for(String s: morse) {
			for(int i = 0; i < morseList.length; i++) {
				if(s.equals(morseList[i])) {
				//	answer += Character.toString(i + 'a');
				}
			}
		}
		System.out.print(answer);
	}

}



// 프로그래머스 

/* class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String [] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String [] morse;
        morse = letter.split(" ");
        for(String s: morse) {
            for(int i = 0; i < morseList.length; i++) {
                if(s.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }
} */