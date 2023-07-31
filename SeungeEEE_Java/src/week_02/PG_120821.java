package week_02;

import java.util.Scanner;

public class PG_120821 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int[] num_list = new int[num];
		int[] answer = new int [num_list.length];
		
		for(int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - i - 1];
			
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		scanner.close();
	}

}

// 프로그래머스 
/* class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
} */