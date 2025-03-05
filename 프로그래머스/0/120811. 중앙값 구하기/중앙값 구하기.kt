class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        array.sort()
        val middle = array.size / 2
        if (array.size % 2 == 0) {
            answer = (array[middle - 1] + array[middle]) / 2
        } else {
            answer = array[middle]
        }
        return answer
    }
}