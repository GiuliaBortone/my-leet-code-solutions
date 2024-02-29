package easyProblems.twoSum_1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `array with two elements always returns 0, 1`() {
        val array = intArrayOf(1, 2)
        val target = 3

        assertThat(solution.twoSum(array, target)).isEqualTo(intArrayOf(0, 1))
    }

    @Test
    fun `array with first two elements add up to the target returns 0, 1`() {
        val array = intArrayOf(1, 2, 3)
        val target = 3

        assertThat(solution.twoSum(array, target)).isEqualTo(intArrayOf(0, 1))
    }

    @Test
    fun `should find correct indexes with array with elements to add up in random position`() {
        val array = intArrayOf(3, 2, 4)
        val target = 6

        assertThat(solution.twoSum(array, target)).isEqualTo(intArrayOf(1, 2))
    }

    @Test
    fun `should find correct indexes with longer array`() {
        val array = intArrayOf(2, 9, 8, 4, 5, 3, 1, 1, 4, 5, 2, 8, 4, 6)
        val target = 15

        assertThat(solution.twoSum(array, target)).isEqualTo(intArrayOf(1, 13))
    }
}