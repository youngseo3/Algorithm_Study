package week_04;

import java.util.Arrays;

public class PG_120899 {
	public static void main(String[] args) {
		int[] array = {9, 10, 11, 8};
		int[] answer = new int[2];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		
		answer[0] = max;
		answer[1] = index;
		
		System.out.print(Arrays.toString(answer));
	}

}

// 프로그래머스 - 가장 큰 수 찾기 
/* class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
} */