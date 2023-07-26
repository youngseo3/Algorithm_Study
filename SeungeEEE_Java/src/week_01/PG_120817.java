package week_01;

public class PG_120817 {
	public static void main(String[]args) {
		int [] numbers = {89,90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		double answer = 0;
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		answer = (double) total / numbers.length;
		
		System.out.println(answer);
	}
}

// 프로그래머스
/* class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int total = 0;
        
        for ( int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        answer = (double) total / numbers.length;
        return answer;
    }
} */
