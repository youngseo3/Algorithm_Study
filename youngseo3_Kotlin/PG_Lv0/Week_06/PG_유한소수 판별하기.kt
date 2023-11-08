package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_06

//fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a
// 다른 사람 풀이
//class Solution {
//    fun solution(a: Int, b: Int): Int {
//        var bottomValue = b / gcd(a, b)
//        var soinsu = 2
//
//        while (bottomValue != 1)
//            if (bottomValue % soinsu == 0) {
//                if (soinsu != 2 && soinsu != 5)
//                    return 2
//
//                bottomValue /= soinsu
//            } else
//                soinsu++
//
//        return 1
//    }
//}

//class Solution {
//    fun getGcd(a: Int, b: Int): Int { // 유클리드 호제법
//        if (b == 0) {
//            throw ArithmeticException("Division by zero")
//        }
//        else if (a % b == 0) return b
//        return getGcd(b, a % b)
//    }
//
//    fun solution(a: Int, b: Int): Int {
//        val gcd = getGcd(a, b) // 최대 공약수
//        var c = b / gcd
//        while(c % 2 == 0){
//            c /= 2
//        }
//        while(c % 5 == 0){
//            c /= 5
//        }
//        if(c == 1) return 1
//        else return 2
//
//    }
//}