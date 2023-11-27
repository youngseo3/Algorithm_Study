import Foundation

// 백준 - 개미
let w = Int(readLine()!)!
let h = Int(readLine()!)!
let p = Int(readLine()!)!
let q = Int(readLine()!)!
let t = Int(readLine()!)!

var P = (p + t) % (2 * w)
var Q = (q + t) % (2 * h)

if P > w { P = 2 * w - P }

if Q > h { Q = 2 * h - Q }

print("\(P) \(Q)")
