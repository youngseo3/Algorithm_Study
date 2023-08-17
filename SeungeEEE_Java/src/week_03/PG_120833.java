package week_03;

import java.util.Arrays;
import java.util.Scanner;

public class PG_120833 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] answer = new int[numbers.length];
		
		answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
	
		System.out.print(Arrays.toString(answer));
	}

}

// 프로그래머스 
/* import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];
        
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        return answer;
    }
} */
