import Foundation

// 시저 암호

func solution(_ s:String, _ n:Int) -> String {
    let strUpper = Array("abcdefghijklmnopqrstuvwxyz".uppercased())
    let strLower = Array("abcdefghijklmnopqrstuvwxyz")
    var result = ""
    
    for i in s {
        if i == " " { result.append(" ") }
        else {
            if strLower.contains(i) {
                result.append(String(strLower[(strLower.firstIndex(of: i)! + n) % 26]))
            } else {
                result.append(String(strUpper[(strUpper.firstIndex(of: i)! + n) % 26]))
            }
        }
    }
    return result
}
