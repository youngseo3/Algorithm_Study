package kr.ac.tukorea.Algorithm_Study.youngseo3_Java.BOJ.Ch01;

import java.util.Scanner;
// 소금 폭탄
public class BOJ_13223 {  //맞는 풀이
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] current = sc.next().split(":");
        String[] target = sc.next().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMinute = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);

        int targetHour = Integer.parseInt(target[0]);
        int targetMinute = Integer.parseInt(target[1]);
        int targetSecond = Integer.parseInt(target[2]);

        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int targetSecondAmount = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int NeedSecondAmount = targetSecondAmount - currentSecondAmount;
        if (NeedSecondAmount <= 0) NeedSecondAmount += 24 * 3600;

        int needHour = NeedSecondAmount / 3600;
        int needMinute = (NeedSecondAmount % 3600) / 60;
        int needSecond = NeedSecondAmount % 60;

        System.out.println(String.format("%02d:%02d:%02d", needHour, needMinute, needSecond));
    }

//     틀린 풀이 why?
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String[] currentTime = sc.nextLine().split(":");
//        String[] dropTime = sc.nextLine().split(":");
//
//        int hour = 0;
//        int min = 0;
//        int sec = 0;
//        hour = 24 - Integer.parseInt(currentTime[0]) + Integer.parseInt(dropTime[0]);
//        min = 60 - Integer.parseInt(currentTime[1]) + Integer.parseInt(dropTime[1]);
//        sec = 60 - Integer.parseInt(currentTime[2]) + Integer.parseInt(dropTime[2]);
//        if(hour >= 24){
//            hour %= 24;
//        }
//
//        if(min >= 60){
//            min %= 60;
//        }
//        if(sec >= 60){
//            sec %= 60;
//        }
//        System.out.println(hour+":"+min+":"+"sec");
//    }
}
