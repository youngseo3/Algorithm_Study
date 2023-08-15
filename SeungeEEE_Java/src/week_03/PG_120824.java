package week_03;


public class PG_120824 {
	public static void main (String[] args) {
		int [] num_list = {1, 2, 3, 4, 5};
		int [] answer = new int[2];
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			answer [0] = even;
			answer [1] = odd;
		}
		System.out.print(answer[0] + ", " + answer[1]);
	}
}

// 프로그래머스 
/* class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            answer[0] = even;
            answer[1] = odd;
        }
        return answer;
    }
} */