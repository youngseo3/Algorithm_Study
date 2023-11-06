package week_04;

import java.util.Arrays;

public class PG_120854 {
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];

		
		for(int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		System.out.print(Arrays.toString(answer));
	}

}

// 프로그래머스 - 배열 원소의 길이 

/* class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int length = strlist.length;
        for(int i = 0; i < length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
} */