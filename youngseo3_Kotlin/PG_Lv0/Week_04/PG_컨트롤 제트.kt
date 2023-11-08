package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04

//import java.util.*
//class Solution { // 다른 사람 풀이 -> Stack 사용해서 Z를 만나면 스택포인터가 가리키는 것을 삭제함
//    fun solution(s: String): Int {
//        var answer = 0
//        val stack = Stack<Int>()
//
//        for (w in s.split(" ".toRegex())) {
//            if (w == "Z") {
//                stack.pop()
//            } else {
//                stack.push(w.toInt())
//            }
//        }
//        for (i in stack) {
//            answer += i
//        }
//        return answer
//    }
//}

//class Solution {
//    fun solution(s: String): Int {
//        var ary = s.split(" ")
//        var a = 0
//        for(i in ary.indices) {
//            if(ary[i].contains("[0-9]".toRegex())) a += ary[i].toString().toInt()
//            else if(i >=1) a -= ary[i-1].toString().toInt()
//            println(a)
//        }
//        return a
//    }
//}
//
//fun main() {
//    var s = Solution()
//    print(s.solution("10 20 30 40"))
//}