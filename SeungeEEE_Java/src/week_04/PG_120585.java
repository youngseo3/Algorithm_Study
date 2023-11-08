package week_04;

import java.util.Scanner;

public class PG_120585 {
	public static void main(String[] arg) {
		int [] array = {149, 180, 192, 170};
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int answer = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > height) {
				answer ++;
			}
		}
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 머쓱이보다 키 큰 사람 

/* class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) {
                answer ++;
            }
        }
        return answer;
    }
} */