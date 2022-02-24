
fun main(args: Array<String>) {
}
    class RomanNumeralConverter {

        fun convertOneThroughThree(a: Int): String {
            var numeralToReturn: String = ""
            when (a) {
                1 -> numeralToReturn = "I"
                2 -> numeralToReturn = "II"
                3 -> numeralToReturn = "III"
            }
            return numeralToReturn
        }

        fun convertFive(a: Int): String {
            return "V"
        }

        fun convertSixThroughEight(a: Int): String {
            var numeralToReturn: String = ""
            when (a) {
                6 -> numeralToReturn = convertFive(5) + "I"
                7 -> numeralToReturn = convertFive(5) + "II"
                8 -> numeralToReturn = convertFive(5) + "III"
            }
            return numeralToReturn
        }

        fun convertTen(a: Int): String {
            return "X"
        }

        fun convertFourAndNine(a: Int): String {
            var numeralToReturn: String = ""
            when (a) {
                4 -> numeralToReturn += "I" + convertFive(5)
                9 -> numeralToReturn += "I" + convertTen(10)
            }
            return numeralToReturn
        }

        fun convertSingleDigit(a: Int): String {
            var numeralToReturn: String = ""
            when (a) {
                1,2,3 -> numeralToReturn += convertOneThroughThree(a)
                4,9 -> numeralToReturn += convertFourAndNine(a)
                5 -> numeralToReturn += convertFive(a)
                6,7,8 -> numeralToReturn += convertSixThroughEight(a)
            }
            return numeralToReturn
        }

        fun convertFifty(a: Int): String {
            return "L"
        }

        fun convertDoubleDigits(a: Int): String {
            var numeralToReturn: String = ""
            val number = a.toString()
            val firstNumber = number.get(0).digitToInt()
            val secondNumber = number.get(1).digitToInt()

            if (firstNumber <= 3) {
                for (i in 1..firstNumber) {
                    numeralToReturn += "X"
                }
            }
            else if (firstNumber == 4) {
                numeralToReturn += "XL"
            }
            else if (firstNumber == 5) {
                numeralToReturn += convertFifty(50)
            }
            else if (firstNumber in 6..8) {
                val sum = 8 - firstNumber
                numeralToReturn += convertFifty(50)
                for (i in 1..sum+3) {
                    numeralToReturn += "X"
                }
            }
            else if (firstNumber == 9) {
                numeralToReturn += "XC"
            }

            numeralToReturn += convertSingleDigit(secondNumber)

            return numeralToReturn
        }

        fun convertOneHundred(a: Int): String {
            return "C"
        }

        fun convertFiveHundred(a: Int): String {
            return "D"
        }

        fun convertTripleDigits(a: Int): String {
            var numeralToReturn: String = ""
            val number = a.toString()
            val firstNumber = number.get(0).digitToInt()
            val secondNumber = number.get(1).digitToInt()
            val thirdNumber = number.get(2).digitToInt()

            if (firstNumber <= 3) {
                for (i in 1..firstNumber) {
                    numeralToReturn += "C"
                }
            }
            else if (firstNumber == 4) {
                numeralToReturn += "CD"
            }
            else if (firstNumber == 5) {
                numeralToReturn += convertFiveHundred(500)
            }
            else if (firstNumber in 6..8) {
                val sum = 8 - firstNumber
                numeralToReturn += convertFiveHundred(500)
                for (i in 1..sum + 1) {
                    numeralToReturn += "C"
                }
            }
            else if (firstNumber == 9) {
                numeralToReturn += "CM"
            }

            val doubleDigits = secondNumber.toString() + thirdNumber.toString()
            numeralToReturn += convertDoubleDigits(doubleDigits.toInt())

            return numeralToReturn
        }

        fun convertOneThousand(a: Int): String {
            return "M"
        }

        fun convertFourDigits(a: Int): String {
            var numeralToReturn: String = ""
            val number = a.toString()
            val firstNumber = number.get(0).digitToInt()
            val secondNumber = number.get(1).digitToInt()
            val thirdNumber = number.get(2).digitToInt()
            val fourthNumber = number.get(3).digitToInt()

            when (firstNumber) {
                1 -> numeralToReturn += convertOneThousand(1000)
                2 -> numeralToReturn += convertOneThousand(1000) + convertOneThousand(1000)
            }

            val tripleDigits = secondNumber.toString() + thirdNumber.toString() + fourthNumber.toString()
            numeralToReturn += convertTripleDigits(tripleDigits.toInt())

            return numeralToReturn
        }
    }



