package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07

class Solution {
    fun solution(babbling: Array<String>): Int = babbling.count { it.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$".toRegex()) }
}

fun main() {
    val word1 = "ayaayaa"
    val word2 = "yemawoo"
    val regex1 = "aya|ye|woo|ma".toRegex()
    val regex2 = "aya(?!aya)".toRegex()

    println(word1.replace(regex1, ""))
    println(word1.replace(regex2, ""))
}