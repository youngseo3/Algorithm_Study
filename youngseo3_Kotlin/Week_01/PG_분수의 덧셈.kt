package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 잘못된 코드
//    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
//
//        var resultNumer = numer1 * denom2 + numer2 * denom1
//        var resultDenom = denom1 * denom2
//        for(i in 1..resultDenom) {
//            if(resultDenom % i == 0 && resultNumer % i == 0) {
//                resultDenom /= i
//                resultNumer /= i
//            }
//        }
//        var answer: IntArray = intArrayOf(resultNumer, resultDenom)
//        return answer
//    }
//}

//class Solution { // 원래 작성했던 코드 -> 시간 복잡도: O(n)
//    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
//
//        val resultNumer = numer1 * denom2 + numer2 * denom1
//        val resultDenom = denom1 * denom2
//
//        var gcd = 1 // 최대 공약수
//        for(i in gcd..resultDenom) {
//            if(resultDenom % i == 0 && resultNumer % i == 0) {
//                gcd = i
//            }
//        }
//        var answer: IntArray = intArrayOf(resultNumer/gcd, resultDenom/gcd)
//        return answer
//    }
//}

class Solution { // 유클리드 호제법을 사용한 코드 -> 시간 복잡도: O(log n)
    fun getGcd(a: Int, b: Int): Int { // 유클리드 호제법
        if (b == 0) {
            throw ArithmeticException("Division by zero")
        }
        else if (a % b == 0) return b
        return getGcd(b, a % b)
    }

    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {

        val resultNumer = numer1 * denom2 + numer2 * denom1
        val resultDenom = denom1 * denom2
        val gcd = getGcd(resultNumer, resultDenom)

        return intArrayOf(resultNumer/gcd, resultDenom/gcd)
    }
}

fun main() {
    var a = Solution()
    println(java.util.Arrays.toString(a.solution(4, 3, 4, 4)))
}