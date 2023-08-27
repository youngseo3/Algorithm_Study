package week_04;

import java.util.Scanner;

public class PG_120851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		my_string = my_string.replaceAll("[a-zA-Z]", "");
		String [] arr = my_string.split("");
		
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			answer += Integer.valueOf(arr[i]);
		}
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 숨어있는 숫자의 덧셈(1)
/* class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.valueOf(arr[i]);
        }
        return answer;
    }
} */