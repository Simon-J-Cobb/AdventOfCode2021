package day1

import ReadFile

class Solution {
    fun solution1(): Int {
        ReadFile()
        val depths = ReadFile().readFileInAsList("src/main/resources/Day1/Question1")
        var count = 0
        depths.windowed(2).forEach {
            if(it[0] < it[1])
                count += 1

        }
        return count

    }
}