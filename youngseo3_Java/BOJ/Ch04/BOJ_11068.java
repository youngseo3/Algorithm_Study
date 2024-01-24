package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch04;

import java.io.*;
import java.util.*;
// 회문인 수
class BOJ_11068 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            boolean ans = false;
            for (int i=2; i<=64; i++) {
                if(isPalindrome(n, i)) {
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? 1 : 0);

        }
    }

    public static boolean isPalindrome(int n, int base) { // 회문인 수인지 검증
        int len = 0;
        int[] ary = new int[50];
        while (n > 0) {
            ary[len++] = n % base;
            n /= base;
        }
// len을 인덱스로 사용함으로 써 배열 길이 나타냄, ary.length를 하면 50이기 때문에 안됨
        for(int k=0; k<len/2; k++) {
            if (ary[k] != ary[len - k - 1]) {
                return false;
            }
        }
        return true;
    }
}
