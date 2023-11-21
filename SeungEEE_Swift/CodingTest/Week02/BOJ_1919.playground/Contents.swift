import Foundation

// 백준 - 애너그램 만들기

let input1 = readLine()!
let input2 = readLine()!

var alphabet = Array("abcdefghijklmnopqrstuvwxyz")
var wordCount1 = Array(repeating: 0, count: 26)
var wordCount2 = Array(repeating: 0, count: 26)
var result = 0

for i in input1 { wordCount1[alphabet.firstIndex(of: i)!] += 1 }
for i in input2 { wordCount2[alphabet.firstIndex(of: i)!] += 1 }

for i in 0..<26 {
    if wordCount1[i] > wordCount2[i] { result += (wordCount1[i] - wordCount2[i]) }
    else { result += (wordCount2[i] - wordCount1[i]) }
}

print(result)
