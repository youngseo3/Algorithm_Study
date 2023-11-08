package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04


//class Solution { 다른 사람 풀이
//    fun solution(numbers: IntArray, k: Int): Int = numbers[(k - 1) * 2 % numbers.size]
//}

//class Solution {
//    fun solution(numbers: IntArray, k: Int): Int {
//        var index = 0
//        for(i in 1..k-1) {
//            index += 2
//            if(numbers.size-1 < index) index -= numbers.size
//        }
//        return numbers[index]
//    }
//}