//package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_03
//
//import java.util.StringTokenizer
//
//class Solution {
//    // 다른 사람 풀이
////    fun solution(letter: String) = letter.split(" ".toRegex()).map { dictionary[it] }.joinToString("")
//
//    fun solution(letter: String): String {
////        val st = StringTokenizer(readLine(), " ")
//        val dictionary = mapOf(
//            ".-" to "a",
//            "-..." to "b",
//            "-.-." to "c",
//            "-.." to "d",
//            "." to "e",
//            "..-." to "f",
//            "--." to "g",
//            "...." to "h",
//            ".." to "i",
//            ".---" to "j",
//            "-.-" to "k",
//            ".-.." to "l",
//            "--" to "m",
//            "-." to "n",
//            "---" to "o",
//            ".--." to "p",
//            "--.-" to "q",
//            ".-." to "r",
//            "..." to "s",
//            "-" to "t",
//            "..-" to "u",
//            "...-" to "v",
//            ".--" to "w",
//            "-..-" to "x",
//            "-.--" to "y",
//            "--.." to "z"
//        )
////        var answer: String = ""
////        while(st.hasMoreTokens()) {
////            var s = st.nextToken()
////            answer += dictionary[s]
////        }
////
////        return answer
//        var answer: String = ""
//        val words = letter.split(" ")
//        for (word in words) {
//            answer += dictionary[word]
//        }
//
//        return answer
//    }
//}
