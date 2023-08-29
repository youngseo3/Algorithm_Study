package week_04;

import java.util.Scanner;

public class PG_120902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int answer = 0;
		String[] arr = my_string.split(" ");
		
		answer += Integer.parseInt(arr[0]);
		
		for(int i = 1; i < arr.length - 1; i++) {
			if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i + 1]);
			} else if(arr[i].equals("-")) {
				answer -= Integer.parseInt(arr[i + 1]);
			}
		}
		
		System.out.print(answer);
	}

}


// 프로그래머스 - 문자열 계산하기 
/* class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        answer += Integer.parseInt(arr[0]);
        
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else if (arr[i].equals("-")) {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        return answer;
    }
} */