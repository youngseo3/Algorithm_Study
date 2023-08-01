package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 다른 사람 풀이 (reversed() 함수 사용)
//    fun solution(num_list: IntArray) = num_list.reversed()
//}

class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = IntArray(num_list.size) {0}
        for(i in num_list.size-1 downTo 0) {
            answer[num_list.size-1-i] = num_list[i]
        }
        return answer
    }
}

fun main() {
    var s = Solution()
    println(java.util.Arrays.toString(s.solution((0..7).toList().toIntArray())))
}