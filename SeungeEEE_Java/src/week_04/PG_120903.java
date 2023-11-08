package week_04;

public class PG_120903 {
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = 0;
		int count = 0;
		
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i].equals(s2[j])) {
					count++;
				}
			}
		}
		answer = count;
		
		System.out.print(answer);
	}

}

// 프로그래머스 - 배열의 유사도 
/* class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int count = 0;
        
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    count++;
                }
            }
        }
        answer = count;
        
        return answer;
    }
} */