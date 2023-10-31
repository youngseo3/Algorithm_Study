package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_06

class Solution { // 다른 사람 풀이
    fun solution(score: Array<IntArray>): IntArray {
        return score.map(IntArray::average)
            .map { score.map(IntArray::average).sortedDescending().indexOf(it) + 1 }.toIntArray()
        //각 요소의 평균 점수가 정렬된 리스트에서 몇 번째 위치에 있는지 찾아서 등수를 계산
    }
}

class Solution { // 못풀어서 다른 사람꺼 참고
    fun solution(score: Array<IntArray>): IntArray {
        val rank = IntArray(score.size)
        println(rank.contentToString())
        for(i in rank.indices) {
            rank[i] = 1
        }
        for(i in rank.indices) {
            for(j in rank.indices) {
                if(score[i][0] + score[i][1] < score[j][0] + score[j][1])
                    rank[i] ++
            }
        }
        return rank
    }
}

fun main() {
    var s = Solution()
    println(s.solution(arrayOf(intArrayOf(80, 70), intArrayOf(90, 50), intArrayOf(40, 70), intArrayOf(50, 80))).contentToString())
}