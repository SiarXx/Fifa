import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

class Mapper(){
    fun mapLines(lines: ArrayList<String>){
        var footballerList= ArrayList<Footballer>()
        var errors = 0;
        lines.forEach {
            val line = it.split(";")
          try{ footballerList.add(Footballer(
                line[1].toInt(),
                line[2],
                line[3].toInt(),
                line[4],
                line[5],
                line[6],
                line[7].toInt(),
                line[8].toInt(),
                line[9],
                line[10],
                moneyFormatter(line[11]),
                moneyFormatter(line[12]),
                line[13].toInt(),
                line[14],
                line[15].toInt(),
                line[16].toInt(),
                line[17].toInt(),
                line[18],
                line[19],
                line[20].toBoolean(),
                line[21],
                line[22].toInt(),
                parseDate(line[23]),
                line[24],
                line[25],
                line[26],
                line[27]
                )
          )
          }catch (e: Exception){
                print("\n\n\nBlad w lini $line[0] \n\n\n")
                errors +=1
              println(errors)
          }

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
    fun parseDate(date: String):Date?{
        if(date.isEmpty())
            return null
        return SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).parse(date)
    }
}