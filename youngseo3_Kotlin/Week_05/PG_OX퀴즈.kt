package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

/* 내가 작성한 코드 -> 잘못된 코드임
-6 - -3 = 9 같은 원소가 주어지면 -6 --3 9 같이 되어서 계산이 안되니깐 에러발생
결국엔 replce를 저런식으로 하면안되고, 무조건 +인지 -인지를 읽어서 if문으로 나눠야함.
*/
//class Solution {
//    fun solution(quiz: Array<String>): Array<String> {
//        var ary = Array(quiz.size) { "" }
//        for (i in quiz.indices) {
//            val a = quiz[i].replace("- ".toRegex(),"-")
//                .replace("[+] ".toRegex(), "")
//                .replace("[=] ".toRegex(), "")
//                .trim()
//                .split(" ".toRegex())
//            if(a[0].toInt() + a[1].toInt() == a[2].toInt()) ary[i] = "O"
//            else ary[i] = "X"
//        }
//        return ary
//    }
//}

class Solution { // if로 다 나눔
    fun solution(quiz: Array<String>): Array<String?> {
        val answer = arrayOfNulls<String>(quiz.size)
        for (i in quiz.indices) {
            val arr = quiz[i].split(" ".toRegex()).toTypedArray()
            if (arr[1] == "+") {
                if (arr[0].toInt() + arr[2].toInt() == arr[4].toInt()) {
                    answer[i] = "O"
                } else {
                    answer[i] = "X"
                }
            } else if (arr[1] == "-") {
                if (arr[0].toInt() - arr[2].toInt() == arr[4].toInt()) {
                    answer[i] = "O"
                } else {
                    answer[i] = "X"
                }
            }
        }
        return answer
    }
}