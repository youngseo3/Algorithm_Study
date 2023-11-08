package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//class Solution { // 다른 사람 풀이 -> Map 사용하여, forEach로 replace함수 호출
//    fun solution(numbers: String): Long {
//        val sample = mapOf(
//            "0" to "zero",
//            "1" to "one",
//            "2" to "two",
//            "3" to "three",
//            "4" to "four",
//            "5" to "five",
//            "6" to "six",
//            "7" to "seven",
//            "8" to "eight",
//            "9" to "nine"
//        )
//        var result = numbers
//        sample.forEach {
//            result = result.replace(it.value, it.key)
//        }
//        return result.toLong()
//    }
//}

//class Solution {
//    fun solution(numbers: String): Long {
//        var numList = arrayOf("zero", "one", "two", "three", "four",
//            "five", "six", "seven", "eight", "nine")
//        var numArray = arrayOf("0", "1", "2", "3", "4",
//            "5", "6", "7", "8", "9")
//        var answer = numbers
//        for(i in numList.indices){
//            if(answer.contains(numList[i])) answer = answer.replace(numList[i], numArray[i])
//        }
//        return answer.toLong()
//    }
//}