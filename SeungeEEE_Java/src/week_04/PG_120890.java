package week_04;

import java.util.ArrayList;
import java.util.Collections;

public class PG_120890 {
	public static void main(String[] args) {
		int [] array = {3, 10, 28};
		int n = 20;
		int answer = 0;
		int min = 100;
		for(int i = 0; i < array.length; i++) {
			if(Math.abs(array[i] - n) < min) {
				min = Math.abs(array[i] - n);
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			if((Math.abs(array[i] - n)) == (min)) {
				arr.add(array[i]);
			}
		}
		
		Collections.sort(arr);
		answer = arr.get(0);
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 가까운 수 

/* import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int n) {
        int min = 100;
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n) < min) {
                min = Math.abs(array[i] - n);
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            if((Math.abs(array[i] - n)) == (min)) {
                arr.add(array[i]);
            }
        }
        Collections.sort(arr);
        
        return arr.get(0);
        
    }
} */