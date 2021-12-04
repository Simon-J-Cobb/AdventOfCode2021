import java.io.File

class ReadFile {

    fun readFileInAsList(fileName: String): List<String>
            = File(fileName).readLines()

}