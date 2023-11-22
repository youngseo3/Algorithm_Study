import Foundation

// 백준 - 문서 검색

var document = readLine()!
let word = readLine()!

var index = document.range(of: word)?.upperBound
var result: Int = 0

while index != nil {
    result += 1
    document = String(document[index!...])
    index = document.range(of: word)?.upperBound
}

print(result)
