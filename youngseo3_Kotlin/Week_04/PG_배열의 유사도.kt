package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이
//    /*s1 배열의 각 요소가 s2 배열에 포함되어 있는지를 검사하여
//     true 또는 false 값을 가지는 불리언 배열을 만들고,
//     그 배열에서 true인 값의 개수를 세는 것*/
//    fun solution(s1: Array<String>, s2: Array<String>) = s1.map(s2::contains).count { it }
//}

class Solution {
    fun solution(s1: Array<String>, s2: Array<String>) =
        s1.count{ c -> s2.contains(c) }
}