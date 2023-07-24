package week_01;
import java.util.Arrays;

public class PG_120811 {
	public static void main(String[] args) {
		int [] array = {1, 2, 7, 10, 11};
		Arrays.sort(array);
		int answer = array [array.length / 2];
		System.out.println(answer);
	}
}

// 프로그래머스 
/* import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array [array.length / 2];
        return answer;
    }
} */
