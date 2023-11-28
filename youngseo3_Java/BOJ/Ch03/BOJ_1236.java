package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch03;

import java.util.Arrays;
import java.util.Scanner;

// 성 지키기

// 1번째 정답 코드 -> CharArray사용하여 원시타입이기 때문에 ==으로 비교 가능
public class BOJ_1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[][] map = new char[a][b];
        for (int i = 0; i < a; i++)
            map[i] = sc.next().toCharArray();

        boolean[] row = new boolean[a];
        boolean[] col = new boolean[b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(map[i][j] == 'X') {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        int countRow= a;
        int countCol= b;
        for(int m=0; m<a; m++){
            if(row[m]) countRow--;
        }
        for(int n=0; n<b; n++){
            if(col[n]) countCol--;
        }
        System.out.println(Math.max(countRow, countCol));
    }
}

// 2번째 정답 코드 -> String 배열을 사용하기 때문에 X라는 값을 비교시 ==이 아니라
// equals를 사용해야한다. 왜냐하면 String은 참조 자료형(클래스)이기 때문.
public class BOJ_1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] row = new int[a];
        int[] col = new int[b];
        int countRow= 0;
        int countCol= 0;

        for(int i=0; i<a; i++){
            // nextLine을 쓰면 런타임 에러 발생, 버퍼에 남겨진 띄어쓰기까지 읽기 때문

            String line = sc.next();
            if(line.contains("X")) row[i] = 1;
            for(int j=0; j<b; j++){
                String[] lineAry = line.split("");
                System.out.println(Arrays.toString(lineAry));
                if(lineAry[j].equals("X")) {
                    col[j] = 1;
                    System.out.println(col[j]);
                }
            }
        }
        for(int m=0; m<a; m++){
            System.out.println(row[m]);
            if(row[m] == 0) countRow++;
        }
        for(int n=0; n<b; n++){
            System.out.println(col[n]);
            if(col[n] == 0) countCol++;
        }
        System.out.println(Math.max(countRow, countCol));
    }
}
