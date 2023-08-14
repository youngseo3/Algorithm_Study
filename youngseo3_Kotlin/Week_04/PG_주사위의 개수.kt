package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 1
        for(i in box.indices) {
            answer *= box[i] / n
        }
        return answer
    }
}