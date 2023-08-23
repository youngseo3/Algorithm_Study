package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var x = 0
        var y = 0
        for(i in keyinput.indices) {
            when(keyinput[i]) {
                "up" -> if(y < board[1] / 2) y++
                "down" -> if(y > board[1] / -2) y--
                "right" -> if(x < board[0] / 2) x++
                "left" -> if(x > board[0] / -2)x--
            }
        }
        return intArrayOf(x, y)
    }
}