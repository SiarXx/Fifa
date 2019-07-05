import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

class Mapper() {
    fun mapLines(lines: ArrayList<String>) {
        var footballerList = ArrayList<Footballer>()
    }

    fun lineSpliter(line: String): Footballer {
        val splited = line.split(";")
        try {
            return (
                    Footballer(
                        splited[1].toInt(),
                        splited[2],
                        splited[3].toInt(),
                        splited[4],
                        splited[5],
                        splited[6],
                        splited[7].toInt(),
                        splited[8].toInt(),
                        splited[9],
                        splited[10],
                        moneyFormatter(splited[11]),
                        moneyFormatter(splited[12]),
                        splited[13].toInt(),
                        splited[14],
                        splited[15].toInt(),
                        splited[16].toInt(),
                        splited[17].toInt(),
                        splited[18],
                        splited[19],
                        splited[20].toBoolean(),
                        splited[21],
                        splited[22].toInt(),
                        parseDate(splited[23]),
                        splited[24],
                        splited[25],
                        splited[26],
                        splited[27]
                    )
                    )
        } catch (e: Exception) {
            return Footballer()
        }

    }
}

fun moneyFormatter(value: String): Double {
    val moneyValueRegex = "(?<number>\\d+\\.\\d+|\\d+)(?<literal>\\w)"
    val pattern = Pattern.compile(moneyValueRegex)
    val matcher = pattern.matcher(value)
    if (matcher.find()) {
        val number = matcher.group("number").toDouble()
        val literal = matcher.group("literal")
        return when (literal) {
            "M" -> number * 1000000.0
            "K" -> number * 1000.0
            else -> number
        }
    } else
        return 0.0
}

fun parseDate(date: String): Date? {
    if (date.isEmpty())
        return null
    return SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).parse(date)
}
}