import java.util.regex.Pattern

class Mapper(){
    fun mapLines(lines: List<String>){
        lines.forEach {
            val singleLine = it.split(";")

        }
    }
    fun moneyFormatter(value: String): Double{
        val moneyValueRegex = "(?<number>\\d+\\.\\d+|\\d+)(?<literal>\\w)"
        val pattern = Pattern.compile(moneyValueRegex)
        val matcher = pattern.matcher(value)
        if (matcher.find()) {
            val number = matcher.group("number").toDouble()
            val literal = matcher.group("literal")
            return when(literal){
                "M" -> number * 1000000.0
                "K" -> number * 1000.0
                else -> number
            }
        }else
            return 0.0
    }
}