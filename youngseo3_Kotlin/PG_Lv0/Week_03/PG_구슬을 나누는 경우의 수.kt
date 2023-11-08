package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_03

//class Solution { // 다른 사람 풀이
//    fun solution(balls: Int, share: Int): Int {
//        var answer = 1.0
//        var shareindex = 1
//        for(i in share+1..balls) {
//            answer = answer * i / shareindex
//            shareindex++
//        }
//        return answer.toInt()
//    }
//}

//class Solution {
//    fun solution(balls: Int, share: Int): Int {
//        var list = (1..balls).toMutableList()
//        var list2 = (1..balls-share).toMutableList()
//        var answer = 1.0
//
//        list.removeAll((1..share).toList()) // mutable은 removeall이 있지만, 그냥 list없음
//        println(list)
//        for (i in list.indices) {
//            answer = answer * list[i].toDouble() / list2[i]
//        }
//        return answer.toInt()
//    }
//}

//fun main() {
//    var s = Solution()
//    println(s.solution(10, 2))
//}