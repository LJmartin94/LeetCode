class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numbersVisited = mutableMapOf<Int, Int>()
        var i: Int? = null
        var j: Int? = null

        for (num in nums.withIndex()){
            i = num.index
            j = numbersVisited.get(target - num.value)
            if (j != null) {
                println("Map of visited numbers: $numbersVisited")
                println("Required index $j found to sum with index $i")
                return intArrayOf(i, j)
            }
            numbersVisited.put(num.value, num.index)
        }
        println("Map of visited numbers: $numbersVisited")
        println("Error - no solution found")
        return intArrayOf(-1, -1)
    }
}