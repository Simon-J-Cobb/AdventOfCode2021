package day3

class Solution {

    fun transpose(matrix: List<String>): List<String>{
        val matrixtransposed = List(matrix[0].length) { "" }.toMutableList()
        for(row in matrix){
            var counter=0
            while(counter < row.length){
                matrixtransposed[counter] = matrixtransposed[counter] + row[counter]
                ++counter

        }}

        return matrixtransposed


    }}


