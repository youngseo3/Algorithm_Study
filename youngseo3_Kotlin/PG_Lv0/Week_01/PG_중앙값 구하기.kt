package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_01

//class Solution { // sort 함수 사용
//    fun solution(array: IntArray): Int{
//        array.sort()
//        return array[array.size/2]
//    }
//}

//class Solution { // 오름차순 정렬 구현
//    fun solution(array: IntArray): Int{
//        for(i in 0 until array.size - 1) {
//            for(j in i + 1 until array.size) {
//                if(array[i] > array[j]) {
//                    var temp = array[i]
//                    array[i] = array[j]
//                    array[j] = temp
//                }
//            }
//        }
//        return array[array.size/2]
////        return array // intArray가 반환형이면 리턴
//    }
//}
//
//fun main() {
//    var s = Solution()
//    var a = intArrayOf(9, -1, 0, 7, 5)
////    println(java.util.Arrays.toString(s.solution(a)))
//    println(s.solution(a))
//
//}