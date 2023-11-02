package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07

class Solution {
    fun solution(s: String, n: Int): String {
        return s.toList().joinToString("") {
            when (it) {
                in 'A'..'Z' -> ('A'.toInt() + (it.toInt() - 'A'.toInt() + n) % ('Z' - 'A' + 1)).toChar()
                in 'a'..'z' -> ('a'.toInt() + (it.toInt() - 'a'.toInt() + n) % ('z' - 'a' + 1)).toChar()
                else -> it
            }.toString()
        }
    }
}