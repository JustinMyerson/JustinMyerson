import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RomanNumeralConverterTest {

    private val testOneThroughThree: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertFive: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertSixThroughEight: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertTen: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertFourAndNine: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertSingleDigit: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertFifty: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertDoubleDigits: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertOneHundred: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertFiveHundred: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertTripleDigits: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertOneThousand: RomanNumeralConverter = RomanNumeralConverter()
    private val testConvertFourDigits: RomanNumeralConverter = RomanNumeralConverter()

    @Test
    fun convertOneThroughThree() {
        val expected = "III"
        assertEquals(expected, testOneThroughThree.convertOneThroughThree(3))
    }

    @Test
    fun convertFive() {
        val expected = "V"
        assertEquals(expected, testConvertFive.convertFive(5))
    }

    @Test
    fun convertSixThroughEight() {
        val expected = "VIII"
        assertEquals(expected, testConvertSixThroughEight.convertSixThroughEight(8))
    }

    @Test
    fun convertTen() {
        val expected = "X"
        assertEquals(expected, testConvertTen.convertTen(10))
    }

    @Test
    fun convertFourAndNine() {
        val expected = "IX"
        assertEquals(expected, testConvertFourAndNine.convertFourAndNine(9))
    }

    @Test
    fun convertSingleDigit() {
        val expected = "VII"
        assertEquals(expected, testConvertSingleDigit.convertSingleDigit(7))
    }

    @Test
    fun convertFifty() {
        val expected = "L"
        assertEquals(expected, testConvertFifty.convertFifty(50))
    }

    @Test
    fun convertDoubleDigits() {
        val expected = "LXXXI"
        assertEquals(expected, testConvertDoubleDigits.convertDoubleDigits(81))
    }

    @Test
    fun convertOneHundred() {
        val expected = "C"
        assertEquals(expected, testConvertOneHundred.convertOneHundred(100))
    }

    @Test
    fun convertFiveHundred() {
        val expected = "D"
        assertEquals(expected, testConvertFiveHundred.convertFiveHundred(500))
    }

    @Test
    fun convertTripleDigits() {
        val expected = "DCCLXXXI"
        assertEquals(expected, testConvertTripleDigits.convertTripleDigits(781))
    }

    @Test
    fun convertOneThousand() {
        val expected = "M"
        assertEquals(expected, testConvertOneThousand.convertOneThousand(1000))
    }

    @Test
    fun convertFourDigits() {
        val expected = "MMCLXXXIX"
        assertEquals(expected, testConvertFourDigits.convertFourDigits(2189))
    }
}