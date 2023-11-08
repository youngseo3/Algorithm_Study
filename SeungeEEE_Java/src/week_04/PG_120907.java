package week_04;

public class PG_120907 {

}

// 프로그래머스 - OX 퀴즈 
/* class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            
            int num1 = Integer.parseInt(s[0]);
            int num2 = Integer.parseInt(s[2]);
            int num3 = Integer.parseInt(s[4]);
            
            if(s[1].equals("+")) {
                if((num1 + num2) == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
            if(s[1].equals("-")) {
                if((num1 - num2) == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
} */