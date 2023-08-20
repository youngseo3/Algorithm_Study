package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이 -> indexOf는 없으면 -1을 반환함
//    fun solution(num: Int, k: Int) = "-$num".indexOf(k.toString())
//}

class Solution {
    fun solution(num: Int, k: Int): Int {
        var n = num.toString()
        return if(n.contains(k.toString())) n.indexOf(k.toString())+1
        else -1
    }
}