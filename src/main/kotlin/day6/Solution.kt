package day6

import day5.Grid
import java.io.File

class Solution {

    fun readInFish(path: String): List<Int>{
        return File(path).readLines()[0].split(",").map { it.toInt() }
    }

    fun solution1(fishes: List<Int>):Int{
        var swarm = Swarm(fishes)
        swarm.day(80)
        return swarm.size()

    }
}