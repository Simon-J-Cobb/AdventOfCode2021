package day4

import ReadFile
import java.io.File

class ReadFileBingo(path: String) {

    var numbers = readInFirstLine(path)
    var boards = readInBingoBoards(path)

    private fun readInFirstLine(path: String): List<Int>{
        return  File(path).readLines()[0].split(",").map { it.toInt() }

    }

    private fun readInBingoBoards(path: String): List<Bingo>{
        var file = File(path).readLines()
        var start = 2
        var boards = emptyList<Bingo>().toMutableList()
            while (start < file.size){
                boards.add(
                    Bingo(listOf<List<Int>>(
                    file[start].split(" ").toMutableList().filter{ it != " " }.filter { it!="" }.map { it.trim().toInt() },
                    file[start + 1].split(" ").toMutableList().filter{ it != " " }.filter { it!="" }.map { it.trim().toInt() },
                    file[start + 2].split(" ").toMutableList().filter{ it != " " }.filter { it!="" }.map { it.trim().toInt() },
                    file[start + 3].split(" ").toMutableList().filter{ it != " " }.filter { it!="" }.map { it.trim().toInt() },
                    file[start + 4].split(" ").toMutableList().filter{ it != " " }.filter { it!="" }.map { it.trim().toInt() })))
                start+=6
            }
        return boards
    }
}