package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//import java.util.*
//
//class Solution { // 다른 사람 풀이 -> Collections.swap(리스트, 인덱스, 인덱스)
//    fun solution(myString: String, num1: Int, num2: Int): String {
//        return myString.toList().let {
//            Collections.swap(it, num1, num2)
//            it.joinToString("")
//        }
//    }
//}

//class Solution {
//    fun solution(my_string: String, num1: Int, num2: Int): String {
//        var new_string = my_string.toMutableList() // -> Array도 원소값이 변경되니까 Array로 생성해도됨
//        val temp = new_string[num1]
//
//        new_string[num1] = new_string[num2]
//        new_string[num2] = temp
//        return new_string.joinToString("")
//    }
//}