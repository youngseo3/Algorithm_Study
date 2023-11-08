package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_05

//class Solution { // 못 풀어서 다른 사람 코드 봤음.
//    fun solution(board: Array<IntArray>): Int {
//        var array2D = Array(board.size+2) { IntArray(board[0].size+2) { 0 } }
//        var answer: Int = 0
//
//        for(i in array2D.indices) {
//            for(j in array2D[i].indices) {
//                if(i == 0 || i == array2D.size-1 || j == 0 || j == array2D[0].size-1)
//                    array2D[i][j] = 1
//                else if(i > 0 && i < array2D.size-1 && j > 0 && j < array2D[0].size-1)
//                    if (board[i-1][j-1] == 1) {
//                        array2D[i-1][j-1] = 1
//                        array2D[i-1][j] = 1
//                        array2D[i-1][j+1] = 1
//                        array2D[i][j-1] = 1
//                        array2D[i][j] = 1
//                        array2D[i][j+1] = 1
//                        array2D[i+1][j-1] = 1
//                        array2D[i+1][j] = 1
//                        array2D[i+1][j+1] = 1
//                    }
//            }
//        }
//        for (array in array2D) {
//            for (e in array) {
//                if (e == 0) {
//                    answer++
//                }
//            }
//        }
//        return answer
//    }
//}