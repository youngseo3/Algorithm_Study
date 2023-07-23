package week_01;

public class PG_120813 {
	public static void main(String[] args) {
		int n = 10;
		int [] answer = {};
		if (n % 2 == 0) {
			answer = new int [n / 2];
		} else {
			answer = new int [(n / 2) + 1];
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (i * 2) + 1;
		}
		System.out.println(answer);
	}
}

// 프로그래머스 
/* class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if (n % 2 == 0) {
            answer = new int [n / 2];
        } else {
            answer = new int [ (n + 1) / 2];
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }
        return answer;
    }
} */
