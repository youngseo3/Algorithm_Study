package week_04;

public class PG_120847 {
	public static void main(String[] args) {
		int max = 0;
		int answer = 0;
		int [] numbers = {0, 31, 24, 10, 1, 9};
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] * numbers[j] > max) {
					max = numbers[i] * numbers[j];
				}
			}
		}
		answer = max;
		
		System.out.print(answer);
	}

}


// 프로그래머스 
/* class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;
        
        return answer;
    }
} */