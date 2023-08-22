package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_05

//class Solution { // 다른 사람 풀이 -> 고정된 크기류 자르고 남은 인덱스도 자를수 있는 chuncked 사용
//    fun solution(my_str: String, n: Int): Array<String> {
//        val list = my_str.chunked(n)
//        return Array<String>(list.size){ list[it] } // list는 2차원 배열이므로 이런식으로 1차원배열 리턴
//    }
//}

class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var index = 0
        var ml = mutableListOf<String>()
        for(i in n-1 until my_str.length step n) {
            ml.add(my_str.slice(index..i))
            index += n
        }
        if(index != my_str.length) ml.add(my_str.slice(index until my_str.length))
        return ml.toTypedArray()
    }
}