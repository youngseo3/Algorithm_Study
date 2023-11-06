package week_04;

public class PG_120878 {

}


// 프로그래머스  - 유한소수 판별하기 

/* import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int num = 0;
        for(int i = 2; i <= a; i++) {
            if(a % i == 0 && b % i == 0) {
                num = i;
            }
        }
        
        if(num != 0) {
            b /= num;
        }
        List<Integer> numArr = new ArrayList<>();
        
        for(int i = 2; i < 1000; i++) {
            if(b % i == 0) {
                numArr.add(i);
                b /= i;
                i--;
                if(b < 2) break;
            }
        }
        
        numArr.removeIf(value -> value == 2 || value == 5);
        if(numArr.size() == 0) return 1;
        return 2;
    }
} */