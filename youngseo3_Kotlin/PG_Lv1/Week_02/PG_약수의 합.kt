package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv1.Week_02

class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        for(i in 1..n){
            if(n%i == 0) sum += i
        }
        return sum
    }
}