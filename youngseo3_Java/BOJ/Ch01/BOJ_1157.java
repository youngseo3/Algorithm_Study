package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch01;

import java.util.Scanner;
// 단어 공부
public class BOJ_1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] count = new int[26];
        char [] ans = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if('a' <= ans[i] && ans[i] <= 'z'){
                ans[i] = (char)('A'-'a'+ans[i]);
            }
            count[ans[i]-'A']++;
        }

        int maxCount = 0;
        char maxAlph = '?';
        for(int i=0; i<26; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlph = (char)('A' + i);
            }
            else if(count[i] == maxCount){
                maxAlph = '?';
            }
        }
        System.out.println(maxAlph);
    }
}
