package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_01

fun main(args: Array<String>) = with(System.`in`.bufferedReader()){
//    val (n) = readLine()!!.split(' ').map(String::toInt) // 프로그래머스 코드에서는 이렇게 입력을 받았음 -> 디스트럭처링
    var n = readLine().toInt()
    for(i in 0 until n) {
        for(j in 0..i) {
            print("*")
        }
        println()
    }
}