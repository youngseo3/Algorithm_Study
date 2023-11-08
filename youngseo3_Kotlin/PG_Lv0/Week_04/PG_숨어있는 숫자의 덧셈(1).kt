package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//class Solution { // 다른 사람 풀이 -> 멤버 참조
//    fun solution(myString: String) = myString.filter(Char::isDigit).map { c -> c.toString().toInt() }.sum()
//}

//class Solution {
//    fun solution(my_string: String): Int {
//        return my_string.replace("[a-z|A-Z]".toRegex(), "")
//            .map { it.toString().toInt() }
//            .fold(0) {acc, num -> acc + num}
//    }
//}