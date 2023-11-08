package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//class Solution { // 다른 사람 풀이 -> filter함수 중첩 및 람다 사용
//    fun solution(n: Int) = (1..n).filter { i -> (1..i).filter { i % it == 0 }.size > 2 }.size
//}

//class Solution {
//    fun solution(n: Int): Int {
//        var count = 0
//        for(i in 4..n) {
//            for(j in 2 until i) {
//                if(i % j == 0) {
//                    count++
//                    break;
//                }
//            }
//        }
//        return count
//    }
//}