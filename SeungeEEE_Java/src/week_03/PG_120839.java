package week_03;

public class PG_120839 {
	public static void main(String[] args) {
		String rsp = "2";
		String answer = "";
		String [] arr = rsp.split("");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("2")) answer += "0";
			else if(arr[i].equals("0")) answer += "5";
			else if(arr[i].equals("5")) answer += "2";
		}
		System.out.print(answer);       
	}

}

// 프로그래머스 

/* class Solution {
    public String solution(String rsp) {
        String answer = "";
        String [] arr = rsp.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("2")) answer += "0";
            else if(arr[i].equals("0"))answer += "5";
            else if(arr[i].equals("5"))
                answer += "2";
        }
        return answer;
    }
} */