class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        // 두 분수를 공통 분모로 변환하여 더하기
        val commonDenom = denom1 * denom2
        val newNumer1 = numer1 * denom2
        val newNumer2 = numer2 * denom1
        val sumNumer = newNumer1 + newNumer2

        // 최대공약수를 구하여 기약 분수로 변환
        val gcd = gcd(sumNumer, commonDenom)
        val reducedNumer = sumNumer / gcd
        val reducedDenom = commonDenom / gcd

        return intArrayOf(reducedNumer, reducedDenom)
    }

    // 최대공약수를 구하는 함수 (유클리드 호제법)
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}