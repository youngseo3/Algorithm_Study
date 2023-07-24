package week_01;

public class PG_120808 {
	public static void main (String[] args) {
		int numer1 = 1;
		int numer2 = 3;
		int denom1 = 2;
		int denom2 = 4;
		int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int max = 1;
        
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        numer = numer / max;
        denom = denom / max;
        int [ ] answer = { numer, denom };
        
        System.out.println(answer);
	}

}

// 프로그래머스
/* class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int max = 1;
        
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        numer = numer / max;
        denom = denom / max;
        int [ ] answer = { numer, denom };
        return answer;
    }
} */