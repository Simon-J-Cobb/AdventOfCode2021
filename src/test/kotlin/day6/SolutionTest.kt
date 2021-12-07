package day6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class SolutionTest {

    var fish = Solution().readInFish("src/test/resources/day6/Question1")

    @Test
    fun solution1Test() {
        assertEquals(5934, Solution().solution1(fish))

    }

}
