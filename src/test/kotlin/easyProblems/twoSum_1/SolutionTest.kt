package easyProblems.twoSum_1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `array has only two elements so the solution is always 0 and 1`() {
        val array = intArrayOf(1, 2)
        val target = 3
        val solution = Solution()

        assertThat(solution.twoSum(array, target)).isEqualTo(intArrayOf(0, 1))
    }
}