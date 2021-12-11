package day7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    var numbers = Solution().readFileInAsListOfNumbers("src/test/resources/day7/Question1")



    @Test
    fun solution1Test(){

        assertEquals(37, Solution().solution1(numbers))
    }
}