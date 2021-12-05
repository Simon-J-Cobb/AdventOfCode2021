import java.io.File

class ReadFile {

    fun readFileInAsListofStrings(fileName: String): List<String>
            = File(fileName).readLines()

    fun readFileInAsListofNumbers(fileName: String): List<Int>
            = File(fileName).readLines().map { a -> a.toInt() }

}