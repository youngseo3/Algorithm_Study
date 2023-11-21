package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.PG_Lv1.Week_02

class Solution { 다른 사람 풀이
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }
            .toIntArray()
    }
}

class Solution { // 내가 푼 풀이
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = arrayListOf<Int>()

        for (i in commands) {
            var a = array.copyOfRange(i[0]-1, i[1])
                .map { it.toString().toInt() }
                .sorted()
            answer.add(a[i[2]-1])
        }
        return answer.toIntArray()
    }
}

fun main(){
    val chars = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q')
    println(chars.joinToString(limit = 5, truncated = "!!!!!") { it.uppercaseChar().toString() }) // A, B, C, D, E, !!!!!
    println(chars.joinToString { "" })
}