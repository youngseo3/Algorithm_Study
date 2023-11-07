package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_07

//class Solution { 다른 사람 풀이
//    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
//        return commands.map { command ->
//            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
//        }
//            .toIntArray()
//    }
//}

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