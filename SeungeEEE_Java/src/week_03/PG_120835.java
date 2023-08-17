package week_03;

import java.util.Arrays;

public class PG_120835 {
	public static void main(String[] agrs) {
		int[] emergency = {3, 76, 24};
		int[] answer = new int[emergency.length];
		
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i] < emergency[j]) {
					answer[i]++;
				}
			}
			answer[i]++;
		}
		System.out.print(Arrays.toString(answer));
	}

}

// 프로그래머스 
/* class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
} */