package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_06

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 1..n) {
            answer++
            while(answer.toString().contains('3') || answer % 3 == 0) {
                answer ++
            }
        }
        return answer
    }
}

fun main() {
    var s = Solution()
    println(s.solution(40))
}