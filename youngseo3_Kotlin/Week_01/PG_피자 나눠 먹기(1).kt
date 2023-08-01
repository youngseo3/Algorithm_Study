package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

class Solution {
    fun solution(n: Int): Int {
        return when(n%7) {
            0 -> n/7
            else -> {
                if(n < 7) 1
                else n / 7 + 1
            }
        }
    }
}