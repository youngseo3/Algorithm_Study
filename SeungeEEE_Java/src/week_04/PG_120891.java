package week_04;

import java.util.Scanner;

public class PG_120891 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		int answer = 0;
		
		String s = Integer.toString(order);
		String[] strOrder = s.split("");
		
		for(int i = 0; i < strOrder.length; i++) {
			if(strOrder[i].equals("3") || strOrder[i].equals("6") || strOrder[i].equals("9")) {
				answer ++;
			}
		}
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 369게임 

/* class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String s = Integer.toString(order);
        String [] strOrder = s.split("");
        
        for(int i = 0; i < strOrder.length; i++) {
            if(strOrder[i].equals("3") || strOrder[i].equals("6") || strOrder[i].equals("9")) {
                answer ++;
            }
        }
        return answer;
    }
} */