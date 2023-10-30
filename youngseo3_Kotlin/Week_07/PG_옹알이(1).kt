package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07


//class Solution { // 다른 사람 풀이
//    fun solution(babbling: Array<String>): Int {
//        val regex = "aya|ye|woo|ma".toRegex()
//        val answer: Int = babbling.map { it.replace(regex, "") }
//            .filter { it.length == 0 }
//            .count()
//        return answer
//    }
//}

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0

        for(i in babbling) {
            if(i.length <= 0) continue
            var containBool = true
            val splitList = i.split("aya","ye","woo","ma")
            println(splitList)
            splitList.forEach {
                if(it.length > 0) {
                    containBool = false
                }
            }
            if(containBool) answer++
        }

        return answer
    }
}

fun main() {
    val s = Solution()
    println(s.solution(arrayOf("aya", "yee", "u", "maa", "wyeoo")))
}