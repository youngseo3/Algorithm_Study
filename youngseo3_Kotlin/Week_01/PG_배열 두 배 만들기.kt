package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size, {0})
        for(i in numbers.indices) {
            answer[i] = numbers[i] * 2
        }
        return answer
    }

}

//class Solution { // 다른 사람 풀이 -> map 함수로 원소의 값을 변환한다. 이때 map함수는 List를 리턴하므로 toIntArray()로 형 변환
//    fun solution(numbers: IntArray) = numbers.map { it * 2 }.toIntArray()
//}

fun main() {
    var s = Solution()
    val a = intArrayOf(1, 2, 3, 4, 5, 6)
    var b = s.solution(a)
    println(b)
}