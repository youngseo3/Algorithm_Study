package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04


//class Solution { 다른 사람 풀이
//    fun solution(numList: IntArray, n: Int): Array<IntArray> {
//        val answer = Array(numList.size / n) { IntArray(n) }
//        var count = 0
//
//        for (i in answer.indices) {
//            for (j in answer[i].indices) {
//                answer[i][j] = numList[count]
//                count++
//            }
//        }
//        return answer
//    }
//}

//class Solution {
//    fun solution(num_list: IntArray, n: Int): List<List<Int>> {
//        var answer = num_list.toList().chunked(n)
//        return answer
//
//    }
//}
//
//fun main() {
//    var s = Solution()
//    print(s.solution((0..8).toList().toIntArray(), 3))
//}