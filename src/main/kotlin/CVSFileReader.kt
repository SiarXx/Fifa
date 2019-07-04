import java.io.File

class CVSFileReader(){
    fun readFileByLine(fileName: String): List<String>
            = File(fileName).bufferedReader().readLines()
}