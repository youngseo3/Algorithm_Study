package week_01;

public class PG_120814 {
	public static void main(String[] args) {
		int n = 7;
		int answer = 0;
		
		if( n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = n / 7 + 1;
		}
		System.out.println(answer);
	} 
}

// 프로그래머스 
/* class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n %7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        return answer;
    }
} */