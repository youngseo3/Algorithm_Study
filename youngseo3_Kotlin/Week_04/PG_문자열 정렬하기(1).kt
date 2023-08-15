package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 풀이 -> 문자열을 먼저 제거하고, IntArray로 변환
//    fun solution(my_string: String) = my_string.replace("[a-z]".toRegex(), "")
//        .map { it.toString().toInt() }
//        .toIntArray()
//        .sortedArray()
//}

class Solution {
    fun solution(my_string: String): IntArray {
        val pattern = "[0-9]".toRegex()
        val answer = pattern.findAll(my_string)
        val matchedNum = answer.map { it.value.toInt() }.toList().toIntArray()
        return matchedNum.sortedArray()
    }
}

fun main() {
    var s = Solution()
    println(s.solution("32dsa4").contentToString())
}