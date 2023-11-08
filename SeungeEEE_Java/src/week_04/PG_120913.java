package week_04;

public class PG_120913 {

}

// 프로그래머스 - 잘라서 배열로 저장하기 

/* class Solution {
    public String[] solution(String my_str, int n) {
        int count = (my_str.length() + n - 1) / n;
        String[] answer = new String[count];
        
        for(int i = 0; i < count; i++) {
            int first = n * i;
            int last = 0;
            if(first + n >= my_str.length()) {
                last = my_str.length();
            } else {
                last = first + n;
            }
            answer[i] = my_str.substring(first, last);
        }
        return answer;
    }
} */