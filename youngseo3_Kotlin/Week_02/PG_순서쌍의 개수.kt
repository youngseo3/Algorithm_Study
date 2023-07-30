package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_02


//// 다른 사람 풀이
//class Solution { // count 세기
//    fun solution(n: Int) = (1..n).count { n % it == 0 }
//}

class Solution {
    fun solution(n: Int): Int {
        var count = 0
        var set = 0
        for(i in 1..n) {
            if(n % i == 0) {
                count ++
            }
        }
        return count
    }
}