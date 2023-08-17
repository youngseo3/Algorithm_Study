package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이 확장함수 let 호출해서 람다함수 사용
//    fun solution(sides: IntArray) = sides.sorted().let { (x, y, z) -> if (x + y > z) 1 else 2 }
//}

class Solution {
    fun solution(sides: IntArray): Int {
        val sortSides = sides.sorted()
        return if(sortSides[2] < sortSides[0] + sortSides[1]) 1
        else 2
    }
}