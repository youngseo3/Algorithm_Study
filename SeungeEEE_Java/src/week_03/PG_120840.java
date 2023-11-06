package week_03;

public class PG_120840 {
    public int PG_120840 (int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls -1), (share -1)) + combination(balls - 1, share);
    }
}


// 프로그래머스 

/* class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls -1), (share -1)) + combination(balls - 1, share);
    }
} */