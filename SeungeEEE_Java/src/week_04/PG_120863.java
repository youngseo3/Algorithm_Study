package week_04;

public class PG_120863 {

}

// 프로그래머스 - 다항식 더하기 

/* class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int strNum = 0;
        int num = 0;
        
        for(String s: arr)  {
            if(s.equals("x")) {
                strNum += 1;
            } else if(s.contains("x")) {
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if(!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        
        if (strNum != 0 && num == 0) {
            if(strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        }
        
        if (strNum != 0 && num != 0) {
            if(strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }
        
        if(strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }
        return answer;
    }
} */