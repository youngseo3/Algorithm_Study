package week_04;

import java.util.Arrays;

public class PG_120844 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		String direction = "right";
		int[] answer = new int[numbers.length];
		
		if(direction.equals("left")) {
			for(int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numbers.length - 1] = numbers[0];
		} else {
			for(int j = 1; j < numbers.length; j++) {
				answer[j] = numbers[j - 1];
			}
			answer[0] = numbers[numbers.length - 1];
		}
		System.out.print(Arrays.toString(answer));
	}

}
// 프로그래머스 

/* class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("left")) {
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[numbers.length - 1] = numbers[0];
        } else {
            for(int j = 1; j < numbers.length; j++) {
                answer[j] = numbers[j - 1];
            }
            answer[0] = numbers[numbers.length - 1];
        }
        return answer;
    }
} */