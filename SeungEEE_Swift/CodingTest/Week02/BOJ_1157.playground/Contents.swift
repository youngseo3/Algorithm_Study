import Foundation

// 백준 - 단어 공부

let word = readLine()!.uppercased()

var dic: [Character: Int] = [:]

for i in word {
    if let value = dic[i] {
        dic[i] = value + 1
    } else {
        dic[i] = 1
    }
}

dic = dic.filter { $0.value == dic.values.max()! }
dic.count > 1 ? print("?") : print(dic.keys.first!)
