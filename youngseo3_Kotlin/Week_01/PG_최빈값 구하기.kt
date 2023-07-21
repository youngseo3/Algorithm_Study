package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

//class Solution { // 잘못된 풀이
//    fun solution(array: IntArray): Int {
//        var count = 1
//        var countMap = mutableMapOf<Int, Int>() // <array의 요소, 중복되는 개수>
//        for(i in array.indices) {
//            if(countMap.containsKey(array[i])) {
//                countMap[array[i]] = countMap.get(array[i])!!+1
//            }
//            else countMap.put(array[i], count)
//        }
//
//        var dupl = 0
//        var result = 0
//        for(i in countMap.keys) {
//            println("i값: $i")
//            if(countMap.values.max() == countMap[i]) { // 오류 발생
//                dupl += 1
//                result = i
//            }
//            if(dupl > 1) return -1
//        }
//        return result
//    }
//}

class Solution { // 내가 작성한 코드 (맞긴함)
    fun solution(array: IntArray): Int {
        var count = 1
        var countMap = mutableMapOf<Int, Int>()
        for (i in array.indices) {
            if (countMap.containsKey(array[i])) {
                countMap[array[i]] = countMap[array[i]]!! + 1
            } else {
                countMap[array[i]] = count
            }
        }

        var dupl = 0
        var result = 0
        val maxValue = countMap.values.maxOrNull()
        for (i in countMap.keys) {
            println("i값: $i")
            if (maxValue == countMap[i]) {
                dupl += 1
                result = i
            }
            if (dupl > 1) {
                return -1
            }
        }
        return result
    }
}

class Solution { // 다른 사람 풀이
    fun solution(array: IntArray): Int {
        val list = array.groupBy { it }.entries.sortedByDescending { (_, value) -> value.size }

        return if (list.size > 1 && list[0].value.size == list[1].value.size) -1 else list[0].key
//        for(i in list.indices) { // 값 확인
//            println("key: $i, value: ${list[i]}")
//        }
//        return 1 // 값 확인
    }
}

fun main() {
    var s = Solution()
    var ary = intArrayOf(2, 3, 5, 7, 1, 4, 2, 1, 1)
    println(s.solution(ary))
}