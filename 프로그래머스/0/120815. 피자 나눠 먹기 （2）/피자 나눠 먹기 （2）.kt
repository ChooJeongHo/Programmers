class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer = lcm(6, n) / 6
        return answer
    }
    
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
        
    fun lcm(a: Int, b: Int): Int {
        return (a * b) / gcd(a, b)
    }
}