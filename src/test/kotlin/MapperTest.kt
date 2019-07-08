import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MapperTest {

    @Test
    fun `Map Test Normal values Succeed`() {
        //Given
        val values = "0;158023;L. Messi;31;https://cdn.sofifa.org/players/4/19/158023.png;Argentina;https://cdn.sofifa.org/flags/52.png;94;94;FC Barcelona;https://cdn.sofifa.org/teams/2/light/241.png;€110.5M;€565K;2202;Left;5;4;4;Medium/ Medium;Messi;Yes;RF;10;Jul 1, 2004;;2021;5'7;159lbs;88+2;88+2;88+2;92+2;93+2;93+2;93+2;92+2;93+2;93+2;93+2;91+2;84+2;84+2;84+2;91+2;64+2;61+2;61+2;61+2;64+2;59+2;47+2;47+2;47+2;59+2;84;95;70;90;86;97;93;94;87;96;91;86;91;95;95;85;68;72;59;94;48;22;94;94;75;96;33;28;26;6;11;15;14;8;€226.5M\n"
        val splited = values.split(";")
        val exception = Footballer(
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
        //When
        val result = Mapper().map(values)
        //Then
        assertEquals(exception,result)
    }
    @Test
    fun `Map Test Bad values Succeed`() {
        //Given
        val values = ""
        val exception = Footballer()
        //When
        val result = Mapper().map(values)
        //Then
        assertEquals(exception,result)
    }
    @Test
    fun `Map Test values age set null Succeed`() {
        //Given
        val values = "0;158023;L. Messi;31;https://cdn.sofifa.org/players/4/19/158023.png;Argentina;https://cdn.sofifa.org/flags/52.png;94;94;FC Barcelona;https://cdn.sofifa.org/teams/2/light/241.png;€110.5M;€565K;2202;Left;5;4;4;Medium/ Medium;Messi;Yes;RF;10;Jul 1, 2004;;2021;5'7;159lbs;88+2;88+2;88+2;92+2;93+2;93+2;93+2;92+2;93+2;93+2;93+2;91+2;84+2;84+2;84+2;91+2;64+2;61+2;61+2;61+2;64+2;59+2;47+2;47+2;47+2;59+2;84;95;70;90;86;97;93;94;87;96;91;86;91;95;95;85;68;72;59;94;48;22;94;94;75;96;33;28;26;6;11;15;14;8;€226.5M\n"
        val splited = values.split(";")
        val exception = Footballer(
            splited[1].toInt(),
            splited[2],
            null,
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
        //When
        val result = Mapper().map(values)
        //Then
        assertEquals(exception,result)
    }
}