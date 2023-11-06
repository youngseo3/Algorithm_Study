package week_04;

public class PG_120583 { 
	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 5};
		int n = 1;
		int answer = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == n) {
				answer ++;
			}
		}
		System.out.print(answer);
	}

}


// 프로그래머스 - 중복된 숫자 개수 

/* class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
} */