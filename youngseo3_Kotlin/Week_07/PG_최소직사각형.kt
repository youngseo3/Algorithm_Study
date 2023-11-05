package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var height = mutableListOf<Int>()
        var width = mutableListOf<Int>()
        for(i in sizes){
            if(i[0]<i[1]){
                height.add(i[1])
                width.add(i[0])
            }else{
                height.add(i[0])
                width.add(i[1])
            }
        }
        return height.maxOrNull()!! * width.maxOrNull()!!
    }
}