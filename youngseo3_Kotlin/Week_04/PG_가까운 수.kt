package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

import kotlin.math.abs

//class Solution { // 다른 사람 풀이 -> minWithOrNull함수 compareBy로 비교해서 최솟값 찾기
//    fun solution(array: IntArray, n: Int) = array.sorted().minWithOrNull(compareBy { abs(it - n) })!!
//}

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        val ary = array.sorted()
        var mtArray = mutableListOf<Int>()
        for (i in ary.indices) {
            mtArray.add(abs(ary[i]-n))
        }
        return ary[mtArray.indexOf(mtArray.minOrNull())]
    }
}