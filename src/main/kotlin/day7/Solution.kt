package day7

import java.io.File
import kotlin.math.abs

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
        }
        return final
        }

    fun solution2(crabs: List<Int>):Int{
        final = crabs.sumOf { crabDistance(0 , it) }
        for(i in 0..crabs.size){
            var current = crabs.sumOf { crabDistance(i , it) }
            if(current < final){
                final =  current
            }
        }
        return final
    }

    fun crabDistance(crab1: Int, crab2:Int):Int{
        var distance = 0;
        for(i in 0..abs(crab1 - crab2)){
            distance += i
        }
        return distance
    }



    }
