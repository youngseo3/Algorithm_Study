package week_01;

public class PG_120816 {
	public static void main(String[] args) {
		int slice = 4;
		int n = 12;
		int answer = 0;
		
		if ( n % slice == 0) {
			answer = n / slice;
		} else {
			answer = n / slice + 1;
		}
		System.out.println(answer);
	}

}

// 프로그래머스 

/* class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if ( n % slice == 0){
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }
} */