package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_03

//class Solution { // 다른 사람 코드 map 함수 사용
//    fun solution(rsp: String): String  = rsp.map{
//        when(it){
//            '2' -> '0'
//            '0' -> '5'
//            else -> '2'
//        }
//    }.joinToString("")
//}

class Solution {
    fun solution(rsp: String): String {
        var list = rsp.chunked(1).toMutableList()
        for(i in list.indices) {
            when(list[i]) {
                "2" -> list[i] = "0"
                "0" -> list[i] = "5"
                else -> list[i] = "2"
            }
        }
        return list.joinToString("")
    }
}

