package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_06

//class Solution { // 배열을 생성해서 각 인덱스의 값이 2 이상이면 겹치는 선분이라 판단.
//    fun solution(lines: Array<IntArray>): Int {
//        var answer: Int = 0
//        var arr = IntArray(201){0}
//        for(i in lines.indices){
//            for(j in lines[i][0]+1 .. lines[i][1]){
//                arr[j+100]++
//            }
//        }
//        answer += arr.count{e-> e >= 2}
//        return answer
//    }
//}
