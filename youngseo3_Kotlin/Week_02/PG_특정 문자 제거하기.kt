package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_02


//class Solution { // 다른 사람 풀이 -> replace
//    fun solution(my_string: String, letter: String)= my_string.replace(letter, "")
//}

class Solution {
    fun solution(my_string: String, letter: String) = my_string.filter { it.toString() != letter }
}

fun main() {
    var s = Solution()
    println(s.solution("abcdeee", "e"))
}