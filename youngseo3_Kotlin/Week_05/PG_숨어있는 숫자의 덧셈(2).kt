package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

//class Solution { // 다른 사람 풀이 -> split할 때 정규표현식을 사용하여 분리할 수 있구나.
//    fun solution(my_string: String): Int  =
//        my_string.split("[A-z]+".toRegex())
//            .filter(String::isNotEmpty)
//            .sumOf(String::toInt)
//}

class Solution {
    fun solution(my_string: String): Int {
        var a = my_string.replace("[a-z|A-Z]".toRegex(), " ")
            .trim()
            .split(" ".toRegex())
        println(a)
        return a.filter { it != "" }.map { it.toInt() }.fold(0) {total, n -> total + n}
    }
}

fun main() {
    var s = Solution()
    println(s.solution("aAb1B2cC34oOp"))
}