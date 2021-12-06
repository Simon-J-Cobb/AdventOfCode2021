package day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun transPoseMatrix() {
        val TestMatrix = listOf<String>("001","010","100","111")
        assertEquals(listOf<String>("0011","0101","1001"), Solution().transpose(TestMatrix))

    }
}