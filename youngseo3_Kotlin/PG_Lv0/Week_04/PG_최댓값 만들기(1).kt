package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

/* 주어진 정수 배열 numbers를 오름차순으로 정렬하고 가장 큰 두개의 숫자를 선택
숫자를 fold함수를 사용하여 곱하는데 이때 초기값은 1, 곱한 값읇 반환 */
//class Solution { // 다른 사람 풀이
//    fun solution(numbers: IntArray): Int  = numbers.sorted().takeLast(2).fold(1) { i, acc -> acc * i }
//}

//class Solution {
//    fun solution(numbers: IntArray): Int {
//        return numbers.sortedDescending()[0] * numbers.sortedDescending()[1]
//        numbers.sort()
//    }
//}