package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 다른 사람 풀이 -> reversed() 함수 사용
//    fun solution(my_string: String): String = my_string.reversed()
//}

class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for(i in my_string.length - 1 downTo 0) {
            answer += my_string[i]
        }
        return answer
    }
}