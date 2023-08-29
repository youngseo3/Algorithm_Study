package week_04;

import java.util.Scanner;
import java.util.Arrays;

public class PG_120897 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10000];
		int index = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				arr[index] = i;
				index++;
			}
		}
		
		int[] answer = new int[index];
		
		for(int i = 0; i < index; i++) {
			if(arr[i] != 0) {
				answer[i] = arr[i];
			}
		}
		System.out.print(Arrays.toString(answer));
	}

}

// 프로그래머스 - 약수 구하기 
/* class Solution {
    public int[] solution(int n) {
        int[] arr = new int[10000];
        int index = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr[index] = i;
                index++;
            }
        }
        
        int[] answer = new int [index];
        
        for(int i = 0; i < index; i++) {
            if(arr[i] != 0) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
} */