import Foundation

// 프로그래머스 - 옹알이(2)

func solution(_ babbling:[String]) -> Int {
    let arr = ["aya", "ye", "woo", "ma"]
    var result = 0
    
    for babble in babbling {
        var word = babble
        
        for i in 0..<arr.count {
            word = word.replacingOccurrences(of: arr[i], with: "\(i+1)")
        }
        
        if Int(word) != nil && !(word.contains("11")
                                 || word.contains("22")
                                 || word.contains("33")
                                 || word.contains("44")) {
            result += 1
        }
    }
    return result
}
