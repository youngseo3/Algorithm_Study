package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

import kotlin.math.pow

//class Solution { // 다른 사람 풀이 -> 시프트 연산
//    fun solution(n: Int, t: Int): Int  = n shl t
//}

class Solution {
    fun solution(n: Int, t: Int) = 2.toDouble().pow(t) * n
}