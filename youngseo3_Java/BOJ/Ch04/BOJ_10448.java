package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 유레카 이론
class BOJ_10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] T = new int[45]; // 삼각수 T[44] = 990
        T[0] = 0;
        for(int i=1; i<45; i++){
            T[i] = T[i-1] + i;
        }

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int K = Integer.parseInt(br.readLine());
            boolean found = false;

            for (int j = 1; j < 45 && !found; j++) {
                for (int k = j; k < 45 && !found; k++) {
                    for (int l = k; l < 45; l++) {
                        if (T[j] + T[k] + T[l] == K) {
                            found = true;
                            break;
                        }
                    }
                }
            }

            if (found) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }
}
