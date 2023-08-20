package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        return numlist.filter { it % n == 0 }.toIntArray()
    }
}