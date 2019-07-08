import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MapperKtTest {

    @Test
    fun `money Formatter Millions Values Successful`() {
        //Given
        val values = "%5M"
        val exception = 5_000_000.0
        //When
        val result = moneyFormatter(values)
        //Then
        assertEquals(exception,result)
    }
    @Test
    fun `money Formatter Tausend Values Successful`() { // tak ma byc
        //Given
        val values = " €  5  K "
        val exception = 5_000.0
        //When
        val result = moneyFormatter(values)
        //Then
        assertEquals(exception,result)
    }
    @Test
    fun `money Formatter Else Values Successful`() { // tak ma byc
        //Given
        val values = "https//"
        val exception = 0.0
        //When
        val result = moneyFormatter(values)
        //Then
        assertEquals(exception,result)
    }
}