package day7

import java.io.File
import java.lang.Math.abs

class Solution {

    var final = 0

    fun readFileInAsListOfNumbers(fileName: String): List<Int>
            = File(fileName).readLines()[0].split(",").map { it.toInt() }

    fun Solution1(crabs: List<Int>):Int{
        var prev = crabs.sumOf { abs(crabs[0] - it) }
        for(crab in crabs){
            println(prev)
            var current = crabs.sumOf { kotlin.math.abs(crab - it) }
            final = if(current < prev){
                current
            } else{
                prev;
            }
            prev = current;
        }
        return final
        }

    }
