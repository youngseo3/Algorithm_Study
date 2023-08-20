package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

//class Solution { // 다른 사람 코드
//    fun solution(n: Int): Int =
//        n.toString().toList().sumOf { it.digitToInt() } // char를 Int로
//}

class Solution {
    fun solution(n: Int) = n.toString().map { it.toString() }.sumOf { it.toInt() }
}