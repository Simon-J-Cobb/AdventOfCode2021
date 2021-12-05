import java.io.File

class ReadFile {

    fun readFileInAsListofStrings(fileName: String): List<String>
            = File(fileName).readLines()

    fun readFileInAsListofNumbers(fileName: String): List<Int>
            = File(fileName).readLines().map { a -> a.toInt() }

    fun readFileInAsListofStringsAndNumbers(fileName: String): List<Pair<String,Int>>
            = File(fileName).readLines().map { a -> stringToPair(a)}

    fun stringToPair(line: String): Pair<String,Int>{
        return Pair(line.split(" ")[0], line.split(" ")[1].toInt())
    }

}