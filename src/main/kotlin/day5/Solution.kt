package day5

import day4.Bingo
import java.io.File
import kotlin.math.max

class Solution {

    public fun readInCoordinates(path: String): List<Grid.CoordinatePair> {
        return File(path).readLines().map { it.split(" -> ") }.map { it.flatMap{it.split(",").map { it.toInt() }}}
            .map { Grid.CoordinatePair(it[0], it[1], it[2], it[3]) }
    }

    public fun solution1(coordinates : List<Grid.CoordinatePair>): Int{
        max(coordinates.maxOf { it.x1 },coordinates.maxOf { it.x2 })
        var grid = Grid(max(coordinates.maxOf { it.x1 },coordinates.maxOf { it.x2 }) + 1,max(coordinates.maxOf { it.y1 },coordinates.maxOf { it.y2 }) + 1)
        for(coord in coordinates){
            grid.drawLine(coord)
        }
        return grid.danger()
    }

    public fun solution2(coordinates : List<Grid.CoordinatePair>): Int{
        max(coordinates.maxOf { it.x1 },coordinates.maxOf { it.x2 })
        var grid = Grid(max(coordinates.maxOf { it.x1 },coordinates.maxOf { it.x2 }) + 1,max(coordinates.maxOf { it.y1 },coordinates.maxOf { it.y2 }) + 1)
        for(coord in coordinates){
            grid.drawLine(coord)
            grid.drawLineDiag(coord)
        }
        return grid.danger()
    }

}