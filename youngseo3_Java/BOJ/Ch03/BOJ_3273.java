package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 두 수의 합
class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] exist = new boolean[1000001];

        for(int i=0; i<n; i++){
            ary[i] = Integer.parseInt(st.nextToken());
            exist[ary[i]] = true;
        }
        int x = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=1; i<=(x-1)/2; i++){
            if(x-i >= 1 && x-i <= 1000000)
                count += (exist[i] && exist[x-i]) ? 1 : 0;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
//class BOJ_3273 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//        int[] ary = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] exist = new int[1000001];
//
//        for(int i=0; i<n; i++){
//            ary[i] = Integer.parseInt(st.nextToken());
//            exist[ary[i]]++;
//        }
//        int x = Integer.parseInt(br.readLine());
//        int count = 0;
//
//        for(int i=1; i<=(x-1)/2; i++){
//            if(x-i <= 1000000)
//                count += exist[i] * exist[x-i];
//        }
//        bw.write(String.valueOf(count));
//        bw.flush();
//    }
//}
