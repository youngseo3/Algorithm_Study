import Foundation

// 숫자 문자열과 영단어

func solution(_ s:String) -> Int {
    var result = s
    let arr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    
    for i in 0..<arr.count {
        result = result.replacingOccurrences(of: arr[i], with: String(i))
    }
    
    return Int(result)!
}
