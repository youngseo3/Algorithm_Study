package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

class Solution {
    fun solution(money: Int): IntArray {
        val quotient = money / 5500
        val remain = money % 5500
        var answer: IntArray = intArrayOf(quotient, remain)
        return answer
    }
}

//class Solution { // 위랑 똑같음
//    fun solution(money: Int) = intArrayOf(money / 5500, money % 5500)
//}