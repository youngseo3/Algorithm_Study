package week_03;

public class PG_120825 {
	public static void main (String[] args) {
		
		String my_string = "hello";
		String answer = "";
		int n = 3;
		
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				answer += my_string.charAt(i);
			}
		}
		System.out.print(answer);
	}
}

// 프로그래머스 
/* class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++){
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
} */