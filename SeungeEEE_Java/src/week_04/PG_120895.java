package week_04;

import java.util.Scanner;

public class PG_120895 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		char[] arr = my_string.toCharArray();
		
		arr[num1] = my_string.charAt(num2);
		arr[num2] = my_string.charAt(num1);
		
		String answer = String.valueOf(arr);
		
		System.out.print(answer);
				
	}

}

// 프로그래머스 - 인덱스 바꾸기 

/* class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        String answer = String.valueOf(arr);
        
        return answer;
    }
} */