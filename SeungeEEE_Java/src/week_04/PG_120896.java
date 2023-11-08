package week_04;

import java.util.Scanner;
import java.util.Arrays;

public class PG_120896 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String answer = "";
		String[] arr = s.split("");
		int count = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			
			if(count == 1) {
				answer += arr[i];
			}
		}
		System.out.print(answer);
	}

}

// 프로그래머스 - 한 번만 등장한 문자 

/* import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int count = 0;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    count ++;
                }
            }
            
            if(count == 1) {
                answer += arr[i];
            }
        }
        return answer;
    }
} */