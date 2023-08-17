package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

class Solution {
    fun solution(strlist: Array<String>): IntArray {
        return strlist.map { it.length }.toIntArray()
    }
}