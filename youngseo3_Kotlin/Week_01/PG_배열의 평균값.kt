package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 다른 사람 풀이 -> average() 함수 사용
//    fun solution(numbers: IntArray) = numbers.average()
//}

class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0
        for (i in numbers.indices) {
            sum += numbers[i]
        }
        return sum.toDouble() / numbers.size
    }
}

fun main() {
    var s = Solution()
    println(s.solution((0..7).toList().toIntArray()))
}