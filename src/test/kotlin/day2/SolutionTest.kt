package day2

import ReadFile
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    var instructions: List<Pair<String, Int>> =
        ReadFile().readFileInAsListofStringsAndNumbers("src/test/resources/day2/Question1")

    @Test
    fun solution1Test() {
        assertEquals(150, Solution().solution1(instructions))

    }
}