package week_04;

import java.util.Arrays;

public class PG_120842 {
	public static void main(String[] args) {
		int [] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int [][] answer = new int[num_list.length / n][n];
		int index = 0;
		
		for(int i = 0; i < num_list.length / n; i++) {
			for(int j = 0; j < n; j++) {
				answer[i][j] = num_list[index++];
			}
		}
		System.out.print(Arrays.deepToString(answer)); // 이차원 배열 출력
	}

}

// 프로그래머스 
/* class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        
        for(int i = 0; i < num_list.length / n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
} */