package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//class Solution {
//    fun solution(n: Int): IntArray {
//        var answer = mutableSetOf<Int>() // Hashset사용해도 추가 가능함. -> 다만 순서 보장하지 않음
//        var result = n
//        for(i in 2..n) {
//            while(result % i == 0) {
//                answer.add(i)
//                result /= i
//            }
//        }
//        return answer.toIntArray()
//    }
//}