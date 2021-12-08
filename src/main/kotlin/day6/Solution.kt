package day6

import day5.Grid
import java.io.File

class Solution {

    fun readInFish(path: String): List<Int>{
        return File(path).readLines()[0].split(",").map { it.toInt() }
    }

    fun solution1(fishes: List<Int>):Long{
        var swarm = Swarm(fishes)
        swarm.day(80)
        return swarm.size()

    }

    fun solution1WithSwarm2(fishes: List<Int>):Long{
        var swarm = Swarm2(fishes)
        swarm.day(80)
        return swarm.size()

    }

    fun solution2(fishes: List<Int>):Long{
        var swarm = Swarm2(fishes)
        swarm.day(256)
        return swarm.size()

    }
}