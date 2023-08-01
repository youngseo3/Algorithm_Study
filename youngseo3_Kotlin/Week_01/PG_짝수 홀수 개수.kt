package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 다른 사람 풀이
//    fun solution(numList: IntArray) = intArrayOf(numList.filter { it % 2 == 0 }.size, numList.filter { it % 2 == 1 }.size)
//}

class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        for(i in num_list.indices) {
            if(num_list[i] % 2 == 0) answer.set(0, answer[0]+1)
            else answer.set(1, answer[1]+1)
        }
        return answer
    }
}