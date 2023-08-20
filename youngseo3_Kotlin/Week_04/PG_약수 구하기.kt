package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이
//    fun solution(n: Int) = (1..n).filter { n % it == 0 }
//}

class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in 1..n) {
            if(n % i == 0) answer.add(i)
        }
        return answer.toIntArray()
    }
}