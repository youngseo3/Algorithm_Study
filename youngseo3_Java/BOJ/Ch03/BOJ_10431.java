package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch03;

import java.util.Scanner;

// 줄 세우기
public class BOJ_10431 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] nums = new int[t][20];
        for(int i=0; i<t; i++){
            sc.nextInt();
            for(int j=0; j<20; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int[] testCount = new int[t];
//        int temp = 0;
        for(int i=0; i<t; i++){
            for(int j=0; j<19; j++){
                for(int k=j+1; k<20; k++){
                    if(nums[i][j] > nums[i][k]){
//                        temp = nums[i][k];
//                        nums[i][k] = nums[i][j];
//                        nums[i][j] = temp;
                        testCount[i]++;
                    }
                }
            }
            System.out.println(i+1+" "+testCount[i]);
        }
    }
}
