package day1

import ReadFile
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    var depths: List<Int> = ReadFile().readFileInAsListofNumbers("src/test/resources/day1/Question1")

    @Test
    fun solution1Test(){
        assertEquals(7, Solution().solution1(depths))

    }

    @Test
    fun solutiion2Test(){
        assertEquals(5, Solution().solution2(depths))
    }
}