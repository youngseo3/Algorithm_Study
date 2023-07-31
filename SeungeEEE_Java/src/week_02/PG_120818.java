package week_02;

import java.util.Scanner;

public class PG_120818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		int answer = 0;
		
		if (price >= 500000) {
			answer = (int)(price * 0.8);
		} else if (price >= 300000) {
			answer = (int)(price * 0.9);
		} else if (price >= 100000) {
			answer = (int)(price * 0.95);
		} else {
			answer = price;
		}
		System.out.println(answer);
		scanner.close();
	}

}
// 프로그래머스 

/* class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 500000) {
            answer = (int)(price * 0.8); 
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price >= 100000) {
            answer = (int)(price * 0.95);
        } else {
            answer = price;
        }
        return answer;
    }
} */