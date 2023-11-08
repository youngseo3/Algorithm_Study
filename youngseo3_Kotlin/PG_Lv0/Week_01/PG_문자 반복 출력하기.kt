package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_01

class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for (i in my_string.indices) {
            repeat(n) {
                answer += my_string[i]
            }
        }

        return answer
    }
}

//class Solution { // 다른 사람 코드 -> 각 요소들의 문자를 문자열로 바꾼 후 반복하고, joinToString 함수 사용하여 문자열 리스트를 하나로 합침
//    fun solution(my_string: String, n: Int): String = my_string.map { it.toString().repeat(n) }.joinToString { "" }
//
//}

fun main() {
    var s = kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_01.Solution()
    println( s.solution("qwer", 4))
}