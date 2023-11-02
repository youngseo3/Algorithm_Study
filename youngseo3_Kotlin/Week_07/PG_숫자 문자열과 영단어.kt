package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07

class Solution {
    fun solution(s: String): Int {
        var numList = arrayOf("zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine")
        var sL = s
        for(i in numList.indices) {
            if(sL.contains(numList[i])) {
                sL = sL.replace(numList[i], "$i")
            }
        }
        return sL.toInt()

    }
}