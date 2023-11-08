package week_04;

import java.util.Scanner;

public class PG_120845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] box = {1, 1, 1};
		int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		
		System.out.print(answer);
	}

}

// 프로그래머스 
/* class Solution {
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
} */