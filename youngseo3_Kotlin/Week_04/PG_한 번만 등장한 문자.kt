package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이 -> groupBy로 나눠서 filter
//    fun solution(s: String): String {
//        return s.split("".toRegex()) // 빈 문자열로 분리하여 문자열을 리스트로 변환
//            .groupBy { it } // 문자들을 그룹화하여 같은 문자끼리 묶음
//            .entries // 그룹화된 결과의 엔트리들에 대해 아래 작업을 수행
//            .filter { (_, value) -> value.size <= 1 } // 중복되지 않는 문자들을 필터링
//            .map { (key, _) -> key } // 중복되지 않는 문자의 키를 추출하여 매핑
//            .sorted() // 추출된 문자들을 정렬
//            .joinToString("") // 정렬된 문자들을 하나의 문자열로 결합
//    }
//}

class Solution { // 다른 사람 풀이 -> 비슷하게 접근하다가 못풀어서 답봤음.
    fun solution(s: String) = s.toSet()
        .filter { uniqueChar -> s.count{ it == uniqueChar} == 1 }
        .sorted()
        .joinToString("")
}