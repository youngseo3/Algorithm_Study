package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch04;

import java.io.*;
import java.util.*;
// 진법변환 2
class BOJ_11005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input != null) {
            StringTokenizer st = new StringTokenizer(input);
            int N = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            int remain = 0;

            while (N > 0) {
                remain = N % B;
                if (remain < 10) {
                    sb.append(remain);
                } else {
                    sb.append((char) ('A' + remain - 10));
                }
                N /= B;
            }

            // 결과를 뒤집어서 출력
            System.out.println(sb.reverse());
        }
    }
}
