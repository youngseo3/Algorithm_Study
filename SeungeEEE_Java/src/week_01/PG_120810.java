package week_01;

public class PG_120810 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		int answer = -1;
		answer = num1 % num2;
		
		System.out.println(answer);
	}

}

// 프로그래머스 
/* class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        if (num1 == 0 || num2 == 0){
            answer = 0;
        } else {
            answer = num1 % num2;
        }
        return answer;
    }
} */
