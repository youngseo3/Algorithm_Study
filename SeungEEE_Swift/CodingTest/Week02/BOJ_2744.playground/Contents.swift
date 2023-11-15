import Foundation

// 백준 - 대소문자 바꾸기

//let input = readLine()!

func swapCase(_ input: String) -> String {
    var result = ""
    
    for char in input {
        if char.isLowercase {
            result.append(char.uppercased())
        } else if char.isUppercase {
            result.append(char.lowercased())
        } else {
            result.append(char)
        }
    }
    return result
}

//let answer = swapCase(input)
//print(answer)
