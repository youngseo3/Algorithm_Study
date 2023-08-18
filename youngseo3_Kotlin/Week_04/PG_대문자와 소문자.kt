package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

class Solution {
    fun solution(my_string: String) =
        my_string.map {
            if(it.isUpperCase()) it.toLowerCase()
            else it.toUpperCase()
        }
            .joinToString("")
}