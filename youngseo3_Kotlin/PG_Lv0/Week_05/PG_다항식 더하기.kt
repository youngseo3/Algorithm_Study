package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_05

//class Solution { // 다른 사람 풀이 -> return 할 때 조건 걸어줌
//    fun solution(polynomial: String): String {
//        var xCount = 0
//        var num = 0
//
//        for (s in polynomial.split(" ".toRegex())) {
//            if (s.contains("x")) {
//                xCount += if (s == "x") 1 else s.replace("x".toRegex(), "").toInt()
//            } else if (s != "+") {
//                num += s.toInt()
//            }
//        }
//        return (if (xCount != 0) if (xCount > 1) "${xCount}x" else "x" else "") + if (num != 0) (if (xCount != 0) " + " else "") + num else if (xCount == 0) "0" else ""
//    }
//}

//class Solution {
//    fun solution(polynomial: String): String {
//        var str = polynomial.replace("+ ", "")
//            .split(" ")
//        val x = str.filter { it.contains("x") }
//            .map { it.replace("x", "").toIntOrNull() ?: 1 }
//            .sum()
//        val n = str.filter { !it.contains("x") }.map { it.toIntOrNull() ?: 0 }.sum()
//        return if(x != 0 && x == 1 &&n != 0 ) "x + $n"
//        else if(x != 0 && n != 0 ) "${x}x + $n"
//        else if(x == 1) "x"
//        else if(x != 0) "${x}x"
//        else "$n"
//    }
//}

