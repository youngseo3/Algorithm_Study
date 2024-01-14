package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 수 정렬하기 3
public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //읽는 라인
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력 라인

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            count[n]++;
        }

        for (int i=1; i<=10000; i++) {
            while (count[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}
