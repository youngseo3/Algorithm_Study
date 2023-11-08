package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv0.Week_04
//class Solution { // 다른 사람 풀이 -> MutableList
//    fun solution(numbers: IntArray, direction: String): IntArray {
//        val numberList = numbers.toMutableList()
//
//        if (direction == "right") {
//            numberList.add(0, numberList.last()) // 첫 번째 인덱스에 추가하면서 나머지 값의 인덱스가 밀려남
//            println(numberList)
//            numberList.removeAt(numberList.lastIndex)
//            println(numberList)
//        } else {
//            numberList.add(numberList.first())
//            numberList.removeAt(0)
//        }
//        return numberList.toIntArray()
//    }
//}

//class Solution {
//    fun solution(numbers: IntArray, direction: String): IntArray {
//        var answer: IntArray = IntArray(numbers.size)
//        if(direction == "right") {
//            for(i in numbers.indices) {
//                if(i+1 >= numbers.size) answer[0] = numbers[i]
//                else answer[i+1] = numbers[i]
//            }
//        }
//        if(direction == "left") {
//            for(i in numbers.indices) {
//                if(i == 0) answer[numbers.size-1] = numbers[i]
//                else answer[i-1] = numbers[i]
//            }
//        }
//        return answer
//    }
//}
//
//fun main() {
//    var s = Solution()
//    print(s.solution((1..3).toList().toIntArray(), "right").contentToString())
//}