package easyProblems.twoSum_1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if (nums.size == 2) {
            return intArrayOf(0, 1)
        }

        val mapOfSeenElements = mutableMapOf<Int, Int>()
        for (index in nums.indices) {
            val numberNeeded = target - nums[index]

            if (mapOfSeenElements.containsKey(numberNeeded)) {
                return intArrayOf(mapOfSeenElements[numberNeeded]!!, index)
            }

            mapOfSeenElements[nums[index]] = index
        }

        return intArrayOf()
    }
}
