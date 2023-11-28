package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch01;

import java.util.Scanner;
// 문서 검색
public class BOJ_1543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String findStr = sc.nextLine();
        int count = 0;

        str = str.replace(findStr, "1");
        char[] ary = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if (ary[i] == '1')
                count++;
        }
        System.out.println(count);

    }
}
