package week_03;

public class PG_120826 {
	public static void main (String[] args) {
		String my_string = "abcdef ";
		String letter = "f";
		String answer = "";
		
		answer = my_string.replace(letter, "");
		
		System.out.print(answer);
	}
}

// 프로그래머스 
/* class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replace(letter, "");
        
        return answer;
    }
} */