package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_02


//class Solution { // 다른 사람 풀이
//    fun solution(e: IntArray) = e.map { e.sortedDescending().indexOf(it) + 1 }.toIntArray()
//}

class Solution {
    fun solution(emergency: IntArray): IntArray {
        var sortEmergency = emergency.sortedByDescending { it }
        var answer: IntArray = IntArray(emergency.size) {0}
        for(i in sortEmergency.indices) {
            for (j in emergency.indices) {
                if (sortEmergency[i] == emergency[j]) answer[j] = i + 1
            }
        }
        return answer
    }
}

fun main() {
    var s = Solution()
    println(s.solution((1..7).toList().toIntArray()).contentToString())
}