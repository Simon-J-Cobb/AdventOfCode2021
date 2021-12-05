package day1

import ReadFile

class Solution {
    fun solution1(filePath: String): Int {
        ReadFile()
        val depths = ReadFile().readFileInAsListofNumbers(filePath)
        var count = 0
        depths.windowed(2).forEach {
            if(it[0] < it[1])
                count += 1

        }
        return count

    }
}