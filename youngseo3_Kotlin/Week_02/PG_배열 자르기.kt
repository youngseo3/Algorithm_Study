package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_02

//class Solution { // 다른 사람 코드 -> sliceArray로 배열 자르기
//    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(num1..num2)
//}

//class Solution { // 다른 사람 코드 -> copyOfRange로 배열 복사본 return
//    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
//        return numbers.copyOfRange(num1, num2 + 1)
//    }
//}

class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer: IntArray = IntArray(num2-num1+1) {0}
        for(i in num1 .. num2) {
            answer[i-num1] = numbers[i]
        }

        return answer
    }
}

fun main() {
    var s = Solution()
    println(java.util.Arrays.toString(s.solution((0..3).toList().toIntArray(), 1, 3)))
}