package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_01


//class Solution { // 다른 사람 풀이 -> while(true) 이용
//    fun solution(n: Int): Int {
//        var pan = 1
//        while(true){
//            if((pan * 6)%n == 0) return pan
//            else pan++
//        }
//    }
//}

//class Solution {
//    fun getGcd(a: Int, b: Int): Int { // 최대 공약수 구하기
//        if(a % b == 0) return b
//        return getGcd(b, a%b)
//    }
//
//    fun getLcm(a: Int, b: Int): Int { // 최소 공배수 구하기
//        val lcm = getGcd(a, b)
//        return a * b / lcm
//    }
//
//    fun solution(n: Int): Int { // 풀이
//        if(n % 6 == 0) {
//            return n / 6
//        }
//        val lcm = getLcm(6, n)
//        return lcm / 6 // 최소 공배수를 6으로 나누면 피자를 몇 판 시켜야 하는지 나옴
//    }
//}
//
//fun main() {
//    var s = Solution()
//    println(s.solution(4))
//}