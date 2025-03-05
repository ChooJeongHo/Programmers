class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        // 1. 숫자별 등장 횟수 구하기 (IntArray → List<Int> 변환 필요)
        val freqMap = array.toList().groupingBy { it }.eachCount()
        // 2. 최빈값의 등장 횟수 찾기
        val maxFreq = freqMap.values.maxOrNull() ?: return -1
        // 3. 최빈값 후보 찾기
        val modeList = freqMap.filter { it.value == maxFreq }.keys
        // 4. 최빈값이 여러 개면 -1, 하나면 반환
        answer = if (modeList.size > 1) -1 else modeList.first()
        return answer
    }
}