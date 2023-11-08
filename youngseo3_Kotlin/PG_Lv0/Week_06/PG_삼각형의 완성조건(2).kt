package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_06

//import kotlin.math.*
//
//class Solution { // 다른 사람 풀이 -> 합 - 차의 절댓값 - 1
//    fun solution(sides: IntArray): Int {
//        var high = sides[0] + sides[1]
//        var low = abs(sides[0] - sides[1])
//
//        return high - low - 1
//    }
//}

//class Solution {
//    fun solution(sides: IntArray): Int {
//        var count = 0
//        val maxNum = sides.maxOrNull()!!
//        val minNum = sides.minOrNull()!!
//        for(i in maxNum - minNum + 1..maxNum)
//            count ++
//        for(i in maxNum + 1 until sides[0] + sides[1])
//            count ++
//        return count
//    }
//}