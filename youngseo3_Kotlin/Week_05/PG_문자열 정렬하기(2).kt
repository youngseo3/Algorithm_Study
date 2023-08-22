package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

class Solution {
    fun solution(my_string: String) =
        my_string.map { it.lowercase() }.sorted().joinToString("")
}