package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch02;

import java.util.Scanner;

import java.util.Scanner;

// 개미

// 정답 코드
public class BOJ_10158
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T = sc.nextInt();

        int p = (P + T) % (2 * W);
        int q = (Q + T) % (2 * H);
        if (p > W) p = 2 * W - p;
        if (q > H) q = 2 * H - q;
        System.out.println(p + " " + q);
    }
}

// 시간초과 발생하기 때문에 틀린 코드
//public class BOJ_10158 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int w = sc.nextInt();
//        int h = sc.nextInt();
//        int p = sc.nextInt();
//        int q = sc.nextInt();
//        int t = sc.nextInt();
//        System.out.println(w+""+h+""+p+""+q+""+t);
//        int deltaX = 1;
//        int deltaY = 1;
//        for (int i=0; i<t; i++){
//            if (p == w) {
//                deltaX = -1;
//                p += deltaX;
//            }
//            else if (p == 0) {
//                deltaX = 1;
//                p += deltaX;
//            }
//            else {
//                p += deltaX;
//            }
//
//            if (q == h) {
//                deltaY = -1;
//                q += deltaY;
//            }
//            else if (q == 0) {
//                deltaY = 1;
//                q += deltaY;
//            }
//            else {
//                q += deltaY;
//            }
//        }
//        System.out.println(p+" "+q);
//    }
//}

