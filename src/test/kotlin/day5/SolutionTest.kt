package day5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class SolutionTest {

    var coordinates = Solution().readInCoordinates("src/test/resources/day5/Question1")

    @Test
    fun solution1Test() {
        assertEquals(5, Solution().solution1(coordinates))

    }
}
