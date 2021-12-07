package day5

import day4.Bingo
import java.io.File

class Solution {

    public fun readInCoordinates(path: String): List<Grid.CoordinatePair> {
        return File(path).readLines().map { it.split(" -> ") }.map { it.flatMap{it.split(",").map { it.toInt() }}}
            .map { Grid.CoordinatePair(it[0], it[1], it[2], it[3]) }
    }

    public fun solution1(coordinates : List<Grid.CoordinatePair>): Int{
        var grid = Grid(10,10)
        for(coord in coordinates){
            grid.drawLine(coord)
        }
        print(grid.grid)
        return grid.danger()
    }

}