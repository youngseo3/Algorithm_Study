package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이 -> distinct 리스트에서 중복 제거 함수
//    fun solution(my_string: String): String = my_string.toList().distinct().joinToString("")
//}

class Solution {
    fun solution(my_string: String): String {
        return my_string.toSet().joinToString("") // set으로 변경후 join해서 합침

    }
}