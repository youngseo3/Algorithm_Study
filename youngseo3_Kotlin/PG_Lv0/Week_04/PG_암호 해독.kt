package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//class Solution { // 다른 사람 풀이 cipher의 인덱스를 filter함수로 거르고, map으로 인덱스에 맞는 문자열 리스트 생성
//    fun solution(cipher: String, code: Int) =
//        cipher.indices.filter { index -> index % code == code - 1 }
//            .map { cipher[it] }
//            .joinToString("")
//}

//class Solution {
//    fun solution(cipher: String, code: Int): String {
//        var answer: String = ""
//        for(i in code..cipher.length step code){
//            answer += cipher[i-1].toString()
//        }
//        return answer
//    }
//}