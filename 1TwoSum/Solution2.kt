class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numbersVisited = mutableMapOf<Int, Int>()
        var j: Int? = null

        for (num in nums.withIndex()){
            j = numbersVisited.get(target - num.value)
            if (j != null) {
                println("Map of visited numbers: $numbersVisited")
                println("Required index $j found to sum with index ${num.index}")
                return intArrayOf(num.index, j)
            }
            numbersVisited.put(num.value, num.index)
        }
        println("Map of visited numbers: $numbersVisited")
        println("Error - no solution found")
        return intArrayOf(-1, -1)
    }
}