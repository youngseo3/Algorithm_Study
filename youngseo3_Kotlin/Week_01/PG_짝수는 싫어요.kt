package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 다른 사람 풀이
//    fun solution(n: Int) = (0..n).filter { it % 2 == 1 }.toIntArray()
//}

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = IntArray(n) {index -> index+1} // 람다를 이용하여 Array 생성
        answer = answer.filter { it % 2 == 1 }.toIntArray() // filter는 리스트를 반환하므로 toIntArray() 필요
        println(java.util.Arrays.toString(answer))
        return answer
    }
}

fun main() {
    var s = Solution()
    s.solution(7)
}