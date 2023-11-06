package week_04;

import java.util.Arrays;
import java.util.Scanner;

public class PG_120850 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		my_string = my_string.replaceAll("[a-z]", "");
		
		String[] arr = my_string.split("");
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(answer);
		
		System.out.print(Arrays.toString(answer));
	}

}

// 프로그래머스 
/* import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        
        String[] arr = my_string.split("");
        int [] answer = new int [arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
} */