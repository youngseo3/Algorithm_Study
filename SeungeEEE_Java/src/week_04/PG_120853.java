package week_04;

import java.util.Scanner;

public class PG_120853 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String [] arr = s.split(" ");
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("Z")) {
				answer -= Integer.parseInt(arr[i - 1]);
				continue;
			}
			answer += Integer.parseInt(arr[i]);
		}
		System.out.print(answer);
	}

}

// 프로그래머스 - 컨트롤 제트 

/* class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
                continue;
            }
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
} */