package day5

import kotlin.math.max
import kotlin.math.min

class Grid(rows: Int,columns: Int) {

    var grid = createGrid(rows, columns)

    fun createGrid(rows: Int, columns: Int):MutableList<MutableList<Int>> {
        return MutableList<MutableList<Int>>(columns) { MutableList<Int>(rows) { 0 } }
    }

    fun drawLine(coordinates: CoordinatePair){
        if (coordinates.direction == "H"){
            for(i in coordinates.x1..coordinates.x2){
                grid[coordinates.y1][i] =  grid[coordinates.y1][i] + 1
            }
        }
        else if (coordinates.direction == "V"){
            for(i in coordinates.y1..coordinates.y2){
                grid[i][coordinates.x1] =  grid[i][coordinates.x1] + 1
            }
        }
    }

    fun danger():Int{
        return grid.sumOf { row -> row.filter { it >= 2 }.size }
    }

    class CoordinatePair(x1: Int, y1: Int, x2: Int, y2: Int){

        var x1= min(x1, x2)
        var
                x2= max(x1, x2)
        var y1= min(y1, y2)
        var y2= max(y1, y2)

        var direction = direction()

        private fun direction():String{
            return if(x1 == x2 && y1 == y2){
                "S"
            } else if(x1 == x2){
                "V"
            } else if(y1 == y2){
                "H"
            } else
                "D"
        }
    }
}
