package week_03;


public class PG_120822 {
	public static void main(String[] args) {
		
		String my_string = "jaron";
		String answer = "";
		
		for (int i = my_string.length() - 1; i >=0; i--) {
			answer += my_string.substring(i, i + 1);
		}
		
		System.out.println(answer);		
	}

}

// 프로그래머스 
/* class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.substring(i, i + 1);
        }
        return answer;
    }
} */