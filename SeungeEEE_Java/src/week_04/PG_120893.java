package week_04;

import java.util.Scanner;

public class PG_120893 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String answer = "";
		char[] arr = my_string.toCharArray();
		
		String temp = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) {
				temp = arr[i] + "";
				answer += temp.toUpperCase();
			} else if(arr[i] >= 65 && arr[i] <= 90) {
				temp = arr[i] + "";
				answer += temp.toLowerCase();
			}
		}
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 대문자와 소문자 
/* class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        String temp = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 97 && arr[i] <= 122) {
                temp = arr[i] + "";
                answer += temp.toUpperCase();
            } else if(arr[i] >= 65 && arr[i] <= 90) {
                temp = arr[i] + "";
                answer += temp.toLowerCase();
            }
        }
        return answer;
    }
} */

// a ~ z 97 ~ 122
// A ~ Z 65 ~ 90