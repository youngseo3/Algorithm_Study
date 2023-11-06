package week_04;

public class PG_120905 {

}


// 프로그래머스 - n의 배수 고르기 
/* class Solution {
    public int[] solution(int n, int[] numlist) {
        int num = 0;
        int count = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                count ++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[num] = numlist[i];
                num++;
            }
        }
        return answer;
    }
} */