package day4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    var file = ReadFileBingo("src/test/resources/day4/Question1")

    @Test
    fun solution1Test() {
        assertEquals(4512, Solution().solution1(file))

    }

    @Test
    fun solution2Test() {
        assertEquals(1924, Solution().solution2(file))

    }
}