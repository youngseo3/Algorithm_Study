package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_06

//import kotlin.math.abs
//class Solution { // 다른 사람 풀이
//    fun solution(dots: Array<IntArray>): Int {
//        var answer: Int = 0
//
//        val x1= dots[0][0]
//        val y1 = dots[0][1]
//        val x2 = dots[1][0]
//        val y2 = dots[1][1]
//        val x3 = dots[2][0]
//        val y3 = dots[2][1]
//        val x4 = dots[3][0]
//        val y4 = dots[3][1]
//
//        if(abs((x1-x2)*(y3-y4)) == abs((y1-y2)*(x3-x4))) return 1
//        if(abs((x1-x3)*(y2-y4)) == abs((y1-y3)*(x2-x4))) return 1
//        if(abs((x1-x4)*(y2-y3)) == abs((y1-y4)*(x2-x3))) return 1
//        return 0
//    }
//}

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val x = dots.map { it[0] }
        val y = dots.map { it[1] }
        return if (x[0] - x[1] == x[2] - x[3] && y[0] - y[1] == y[2] - y[3]) 1
        else if (x[0] - x[2] == x[1] - x[3] && y[0] - y[2] == y[1] - y[3]) 1
        else if (x[0] - x[3] == x[1] - x[2] && y[0] - y[3] == y[1] - y[2]) 1

        else if ((x[0] - x[1]).toDouble() / (x[2] - x[3]) == (y[0] - y[1]).toDouble() / (y[2] - y[3])) 1
        else if ((x[0] - x[2]) / (x[1] - x[3]) == (y[0] - y[2]) / (y[1] - y[3])) 1
        else if ((x[0] - x[3]) / (x[1] - x[2]) == (y[0] - y[3]) / (y[1] - y[2])) 1
        else 0
    }
}