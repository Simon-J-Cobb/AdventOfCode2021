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

    fun solution1(matrix: List<String>): Int {
        var gamma = ""
        var epsilon = ""
        val transposedMatrix = transpose(matrix)
        for(row in transposedMatrix){
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




fun solution2(matrix: List<String>): Int {
    fun reduce(matrix: List<String>, counter: Int, Oxygen:Boolean): String {
        return if (matrix.size == 1)
            return matrix[0]
        else {
            val transposedMatrix = transpose(matrix)
            val ints = transposedMatrix[counter].map { it.digitToInt() }.toTypedArray()
            if (ints.count { it == 1 } >= ints.count { it == 0 }) {
                reduce(matrix.filter { it[counter] == (if(Oxygen){'1'}else{'0'}) }, counter + 1, Oxygen)

            } else {
                reduce(matrix.filter { it[counter] == (if(Oxygen){'0'}else{'1'}) }, counter + 1, Oxygen)
            }
        }
        }



    return reduce(matrix,0, true).toInt(2) * reduce(matrix,0, false).toInt(2)

}
}

