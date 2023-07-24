package week_01;

public class PG_120809 {
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5};
		int [] answer = new int[numbers.length];
		
		 for (int i = 0; i < numbers.length; i++) {
	            answer[i] = numbers[i] * 2;
	        }
	        System.out.println(answer);
	}
}

// 프로그래머스
/* class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
} */