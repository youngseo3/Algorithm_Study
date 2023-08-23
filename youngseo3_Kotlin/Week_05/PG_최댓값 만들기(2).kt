package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

//import kotlin.math.max
//
//class Solution { // 다른 사람 풀이 -> 정렬 후 제일 앞에 있는 최솟값의 곱과, 맨 뒤에 있는 최댓값의 곱 max사용
//    fun solution(numbers: IntArray): Int {
//        val sorted = numbers.sorted()
//        return max(sorted[0] * sorted[1], sorted[sorted.lastIndex] * sorted[sorted.lastIndex - 1])
//    }
//}

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -100000000
        for(i in 0 until numbers.size - 1) {
            for(j in i+1 until numbers.size) {
                if(numbers[i] * numbers[j] > answer) answer = numbers[i] * numbers[j]
            }
        }
        return answer
    }
}