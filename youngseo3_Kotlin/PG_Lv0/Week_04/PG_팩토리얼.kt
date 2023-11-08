package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04
// 다른 사람 풀이 꼬리 재귀 tailrec사용, 자신만을 호출하다 리턴하는 구조
// -> 코드가 컴파일될때 루프를 사용한 코드로 변경, 즉 스택 오버플로우 발생 X
//class Solution {
//    fun solution(n: Int) = (2..n).find { n < factorial(it) }?.dec() ?: n
//    private tailrec fun factorial(n: Int, run: Int = 1): Int = if (n == 1) run else factorial(n - 1, run * n)
//}

//class Solution {
//    fun solution(n: Int): Int {
//        var result = 1
//        when(n) {
//            0 -> return result
//            1 -> return result
//        }
//        for(i in 1..10) {
//            var k = (1..i).fold(1) { acc, i -> acc * i }
//            if (n < k) {
//                result = i-1
//                break
//            }
//        }
//        return result
//    }
//}