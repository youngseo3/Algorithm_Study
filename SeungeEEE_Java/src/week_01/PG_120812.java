package week_01;
import java.util.Arrays;

public class PG_120812 {
	public static void main(String[] args) {
		int answer = 0;
		int max = 0;
		int [] array = {1, 2, 3, 3, 3, 4};
		Arrays.sort(array);
		max = array[array.length -1];
		
		int count[] = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			count[array[i]] ++;
		}
		max = count[0];
		
		for (int i = 1; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = i;
			} else if (max == count[i]) {
				answer = -1;
			}
		}
		System.out.println(answer);
	}
}

// 프로그래머스 
/* import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        Arrays.sort(array);
        max = array[array.length -1];
        
        int count[] = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]] ++;
        }
        max = count[0];
        
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i;
            } else if (max == count [i]) {
                answer = -1;
            }
        }
        return answer;
    }
} */