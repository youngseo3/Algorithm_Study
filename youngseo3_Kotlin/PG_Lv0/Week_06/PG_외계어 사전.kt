package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_06

//class Solution { // 다른 사람 풀이
//    fun solution(spell: Array<String>, dic: Array<String>) =
//        if (dic.map { it.toList().sorted().joinToString("") }
//                .contains(spell.sortedArray().joinToString(""))) 1 else 2
//}

//class Solution {
//    fun solution(spell: Array<String>, dic: Array<String>): Int {
//        var r = 0
//        for(i in dic.indices) {
//            for(j in spell.indices) {
//                if(!dic[i].contains(spell[j])) {
//                    r = 0
//                    break
//                }
//                else r++
//            }
//            if(r == spell.size) return 1
//        }
//        return 2
//    }
//}
//
//fun main() {
//    var s = Solution()
//    println(s.solution(arrayOf("p", "o", "s"), arrayOf("sod", "sop")))
//}