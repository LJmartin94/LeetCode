class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //easy way to solve -> sort collection by smallest to largest, compare first and last

        // Save initial order
        val original = nums.copyOf() //expensive

        // Sort collection
        nums.sort() //expensive
        println("Original input: ${original.joinToString()}")
        println("Sorted input: ${nums.joinToString()}")

        //compare first (i) and last (j) index
        var i = 0
        var j = nums.size - 1
        var sum = nums[i] + nums[j]

        //while sum is greater than target drop biggest index
        //while sum is lower than target drop smallest index
        //repeat until exactly target
        while (sum != target || i > j){
            if (sum > target)
                j--
            if (sum < target)
                i++
            sum = nums[i] + nums[j]
        }
        println("Sorted indexes for solution: $i and $j")

        //Get values associated with indexes
        i = nums[i]
        j = nums[j]
        println("Sorted values for solution: $i and $j")

        i = original.indexOfFirst{it == i}
        j = original.indexOfLast{it == j}
        println("Original indexes for solution: $i and $j")

        //Return original locations of those values
        return intArrayOf(i, j)
    }
}