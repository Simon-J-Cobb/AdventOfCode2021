package day8

import java.io.File

class Solution {

    fun readFileInAsListOfStrings(fileName: String): List<List<String>> =
        File(fileName).readLines().map { it.split(" ") }

    fun toOutput(commands: List<List<String>>):List<List<String>>{
        var output = emptyList<List<String>>().toMutableList()
        for(command in commands){
            if(command.contains("|")){
                continue
            }
            else{
                output.add(command)
            }
        }
        return output
    }

    fun solution1(commands: List<List<String>>):Int{
        var output = toOutput(commands)
        var count=0
        for(line in output){
            count += applyAlgorithm(line)
        }
        return count

    }

    private fun applyAlgorithm(line: List<String>): Int {
        var count= 0
        for(entry in line){
            when(entry.length){
                7 -> count +=1
                4 -> count +=1
                3 -> count +=1
                2 -> count +=1
            }
        }
        return count

    }

}