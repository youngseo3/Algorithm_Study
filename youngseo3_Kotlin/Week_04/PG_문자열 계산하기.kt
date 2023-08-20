package kr.ac.tukorea.Algorithm_Study.youngseo3_Kotlin.Week_04

//class Solution { // 다른 사람 풀이 -> +는 생략, -는 숫자 바로앞에 붙임. 센스있는 풀이
//    fun solution(myString: String) = myString.replace("- ".toRegex(), "-")
//        .replace("[+] ".toRegex(), "")
//        .trim()
//        .split(" ".toRegex())
//        .sumOf { it.toInt() }
//}

import java.util.Stack
class Solution {
    fun solution(my_string: String): Int {
        val strList = my_string.split(" ")
        val sp = Stack<String>()
        var result = 0

        for(i in strList.indices) {
            sp.push(strList[i])
            if(sp.size == 3) {
                val a = sp.pop().toInt()
                if(sp.pop() == "-") {
                    result = sp.pop().toInt() - a
                } else {
                    result = sp.pop().toInt() + a
                }
                sp.push(result.toString())
            }

        }
        return result
    }
}