package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_03

//class Solution { // 다른 사람 코드
//    fun solution(dot: IntArray) = when {
//        (dot[0] > 0 && dot[1] > 0) -> 1
//        (dot[0] < 0 && dot[1] > 0) -> 2
//        (dot[0] < 0 && dot[1] < 0) -> 3
//        else -> 4
//    }
//}

class Solution {
    fun solution(dot: IntArray): Int {
        val x = dot[0]
        val y = dot[1]
        return if (x > 0 && y > 0) 1
        else if (x < 0 && y > 0) 2
        else if (x < 0 && y < 0) 3
        else 4
    }
}