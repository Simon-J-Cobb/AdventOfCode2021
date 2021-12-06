package day3

import ReadFile
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun transPoseMatrix() {
        val testMatrix = listOf<String>("001","010","100","111")
        assertEquals(listOf<String>("0011","0101","1001"), Solution().transpose(testMatrix))

    }

    var matrix: List<String> =
        ReadFile().readFileInAsListofStrings("src/test/resources/day3/Question1")

    @Test
    fun solution1Test() {
        assertEquals(198, Solution().Solution(matrix))

    }
}