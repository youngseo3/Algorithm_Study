package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

//class Solution {
//    // 다른 사람 풀이
//    // map으로 각 배열의 x좌표와 y좌표를 set으로 표현하여 각각 2개의 값만 갖게됨.
//    fun solution(dots: Array<IntArray>): Int {
//        val coordX = dots.map { it[0] }.toSortedSet()
//        val coordY = dots.map { it[1] }.toSortedSet()
//
//        return (coordX.last() - coordX.first()) * (coordY.last() - coordY.first())
//    }
//}

import kotlin.math.abs
class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var width = 0
        var height = 0
        for(i in 1..3) {
            if(dots[0][0] != dots[i][0]) {
                width = dots[i][0] - dots[0][0]
                println("width: $width")
            }
            if (dots[0][1] != dots[i][1]) {
                height = dots[i][1] - dots[0][1]
                println("height: $height")
            }
        }
        return abs(width * height)
    }
}

fun main() {
    val array2D = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(2, 1),
        intArrayOf(2, 2),
        intArrayOf(1, 2)
    )
    var s = Solution()
    println(s.solution(array2D))
}
// 이런식으로 커스텀으로 작성해서 두 배열을 비교하여 쓸 수 있음, 아니면 contentEquals 함수 사용해야함.
fun isEqual(first: IntArray?, second: IntArray?): Boolean {
    if (first == null || second == null) {
        return false
    }
    if (first.size != second.size) {
        return false
    }
    for (i in first.indices) {
        if (first[i] != second[i]) {
            return false
        }
    }
    return true
}