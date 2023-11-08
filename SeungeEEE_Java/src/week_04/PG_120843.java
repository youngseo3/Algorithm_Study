package week_04;

public class PG_120843 {
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4};
		int k = 2;
		int answer = 0;
		int index = 0;
		
		for(int i = 1; i < k; i++) {
			index += 2;
		}
		index %= numbers.length;
		answer = numbers[index];
		
		System.out.print(answer);
	}
}

// 프로그래머스 
/* class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        for(int i = 1; i < k; i++) {
            index += 2;
        }
        index %= numbers.length;
        
        answer = numbers[index];
        
        return answer;
    }
} */