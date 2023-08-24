package week_04;

public class PG_120841 {
	public static void main(String[] args) {
		int[] dot = {-2, -4};
		int answer = 0;
		
		if(dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if(dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		} else if(dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else if(dot[0] > 0 && dot[1] < 0) {
			answer = 4;
		}
		System.out.print(answer);
	}

}


// 프로그래머스 
/* class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0) {          
            answer = 1;
        } else if(dot[0] < 0 && dot[1] > 0) {    
            answer = 2;
        } else if(dot[0] < 0 && dot[1] < 0) {    
            answer = 3;
        } else if(dot[0] > 0 && dot[1] < 0) {    
            answer = 4;
        }
        return answer;
    }
} */