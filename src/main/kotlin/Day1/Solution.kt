package Day1

import ReadFile

class Solution {
    fun solution1(){
        ReadFile()
        val depths = ReadFile().readFileInAsList("src/main/resources/Day1/Question1")
        for(depth in depths)
            println(depth)
    }
}