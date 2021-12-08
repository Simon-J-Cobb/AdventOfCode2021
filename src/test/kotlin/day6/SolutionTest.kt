package day6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class SolutionTest {

    var fish = Solution().readInFish("src/test/resources/day6/Question1")

    @Test
    fun solution1Test() {
        assertEquals(5934, Solution().solution1(fish))

    }

    @Test
    fun solution1TestWithSwarm2() {
        assertEquals(5934, Solution().solution1WithSwarm2(fish))

    }

    @Test
    fun solution2Test() {
        assertEquals(26984457539, Solution().solution2(fish))

    }

}
