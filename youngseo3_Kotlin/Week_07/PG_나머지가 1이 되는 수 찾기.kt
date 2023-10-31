package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07

class Solution {
    fun solution(n: Int): Int {
        var result = 0
        for(i in 1..n){
            if(n % i == 1) {
                result = i
                break
            }
        }
        return result
    }
}