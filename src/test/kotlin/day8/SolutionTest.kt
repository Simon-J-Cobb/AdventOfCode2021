package day8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    var digits = Solution().readFileInAsListOfStrings("src/test/resources/day8/Question1")

    @Test
    fun solution1Test(){
        assertEquals(26, day8.Solution().solution1(digits))

    }
}