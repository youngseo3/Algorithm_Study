package week_04;

import java.util.Arrays;

public class PG_120862 {
	public static void main(String[] args) {
		int[] numbers = {};
		int answer = 0;
		Arrays.sort(numbers);
		answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length -1] * numbers[numbers.length - 2]);
		
	}

}

// 프로그래머스 - 최댓값 만들기(2)

/* import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
        
        return answer;
    }
} */