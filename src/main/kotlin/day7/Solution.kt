package day7

import java.io.File

class Solution {

    var final = 0

    fun readFileInAsListOfNumbers(fileName: String): List<Int>
            = File(fileName).readLines()[0].split(",").map { it.toInt() }

    fun solution1(crabs: List<Int>):Int{
        final = crabs.sumOf { kotlin.math.abs(0 - it) }
        for(i in 0..crabs.size){
            var current = crabs.sumOf { kotlin.math.abs(i - it) }
            if(current < final){
                final =  current
            }
            println(final)
        }
        return final
        }

    }
