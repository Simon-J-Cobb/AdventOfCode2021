package day5

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Grid(rows: Int,columns: Int) {

    var grid = createGrid(rows, columns)

    fun createGrid(rows: Int, columns: Int):MutableList<MutableList<Int>> {
        return MutableList<MutableList<Int>>(columns) { MutableList<Int>(rows) { 0 } }
    }

    fun drawLine(coordinates: CoordinatePair){
        if (coordinates.direction == "H"){
            if(coordinates.x1< coordinates.x2) {
                for (i in coordinates.x1..coordinates.x2) {
                    grid[coordinates.y1][i] += 1
                }
            }
            else{
                for (i in coordinates.x2..coordinates.x1) {
                    grid[coordinates.y1][i] += 1
                }
            }
        }
        else if (coordinates.direction == "V"){
            if(coordinates.y1< coordinates.y2) {
                for(i in coordinates.y1..coordinates.y2){
                    grid[i][coordinates.x1] += 1
                }
            }
            else{
                for(i in coordinates.y2..coordinates.y1){
                    grid[i][coordinates.x1] += 1
                }
            }

        }
    }

    fun drawLineDiag(coordinates: CoordinatePair){
        if (coordinates.direction == "D"){
            if(coordinates.x2 > coordinates.x1){
                if(coordinates.y2 > coordinates.y1)
                {
                    for(i in 0..(coordinates.x2 - coordinates.x1)){
                        grid[coordinates.y1 + i][coordinates.x1 + i] += 1
                    }
                }
                else{
                    for(i in 0..(coordinates.x2 - coordinates.x1)){
                        grid[coordinates.y1 - i][coordinates.x1 + i] += 1
                    }

                }
            }
            else{
                if(coordinates.y2 > coordinates.y1)
                {
                    for(i in 0..(coordinates.x1 - coordinates.x2)){
                        grid[coordinates.y1 + i][coordinates.x1 - i] += 1
                    }
                }
                else{
                    for(i in 0..(coordinates.x1 - coordinates.x2)){
                        grid[coordinates.y1 - i][coordinates.x1 - i] += 1
                    }

                }
            }

        }

    }


    fun danger():Int{
        return grid.sumOf { row -> row.filter { it >= 2 }.size }
    }

    class CoordinatePair(var x1: Int, var y1: Int, var x2: Int, var y2: Int){

        var direction = direction()

        private fun direction():String{
            return if(x1 == x2 && y1 == y2){
                "S"
            } else if(x1 == x2){
                "V"
            } else if(y1 == y2){
                "H"
            } else if(abs((y2-y1)/(x2-x1)) == 1) {
                "D"
            }
            else{
                "X"
            }
        }
    }
}
