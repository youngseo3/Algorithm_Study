package week_04;

import java.util.Scanner;

public class PG_120848 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= 10; i++) {
			if(n >= fac(i)) {
				answer = i;
			} else {
				break;
			}
		}
		System.out.print(answer);
	}
	
	public static int fac(int num) {
		if(num > 1) return num * fac(num - 1);
		
		return num;
	}

}

// 프로그래머스 

/* class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 10; i++) {
            if(n >= fac(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
    
    public int fac(int num) {
        if(num > 1) return num * fac(num - 1);
        
        return num;
    }
} */