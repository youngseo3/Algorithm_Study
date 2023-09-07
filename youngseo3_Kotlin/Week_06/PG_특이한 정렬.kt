package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_06

import java.lang.Math.abs

class Solution {
    /* compareBy를 사용해 정렬 기준을 2가지로
    -> 1.절댓값이 작은 순서 2. -를 붙여서 작은 순서부터(실제값이 큰 순서)
    따라서 절댓값이 같은 요소들은 숫자가 큰 것이 먼저 오도록 */
    fun solution(numlist: IntArray, n: Int) =
        numlist.sortedWith(compareBy ({abs(it - n)}, { -it })).toIntArray()
}

//class Solution {
//    fun solution(numlist: IntArray, n: Int): IntArray {
//        var a = numlist.sortedWith(compareBy {abs(it - n)}).toMutableList()
//        for(i in 1 until a.size-1) {
//            for(j in i+1 until a.size) {
//                if(abs(a[i] - n) == abs(a[j] - n) && a[i] < a[j]) {
//                    val temp = a[j]
//                    a[j] = a[i]
//                    a[i] = temp
//                }
//            }
//        }
//        return a.toIntArray()
//    }
//}