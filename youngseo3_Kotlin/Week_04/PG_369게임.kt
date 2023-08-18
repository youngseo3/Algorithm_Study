package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이 -> 이게 더 좋은듯
//    fun solution(order: Int): Int = order.toString().count { it == '3' || it == '6' || it == '9' }
//}

class Solution {
    fun solution(order: Int): Int {
        var count = 0
        for(i in order.toString()) {
            if(i == '3' || i == '6' || i == '9') count ++
            // if("[369]".toRegex().matches(i.toString())) count ++
            // "3|6|9"라 써도 됨
        }
        return count
    }
}
