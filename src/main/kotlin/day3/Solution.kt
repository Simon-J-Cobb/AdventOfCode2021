package day3

class Solution {

    fun transpose(matrix: List<String>): List<String>{
        val transposedMatrix = List(matrix[0].length) { "" }.toMutableList()
        for(row in matrix){
            var counter=0
            while(counter < row.length){
                transposedMatrix[counter] = transposedMatrix[counter] + row[counter]
                ++counter

        }}

        return transposedMatrix
    }

    fun Solution(matrix: List<String>): Int {
        var gamma = ""
        var epsilon = ""
        val transposedMatrix = transpose(matrix)
        for(row in transposedMatrix){
            println(row)
            val ints = row.map { it.digitToInt() }.toTypedArray()
            if(ints.count { it == 1 } > ints.count { it == 0 }) {
                gamma += "1"
                epsilon += "0"
            }
            else {
                gamma += "0"
                epsilon += "1"
        }
        }
        return gamma.toInt(2) * epsilon.toInt(2)}


    }


