package uz.ruzibekov.calculator.helper

class CalculatorManager {

    fun calculate(text: String): Int {
        return when {
            text.isOneDigitNumberAndOneAction() -> text.oneDigitNumberAndOneActionCalc()
            else -> 0
        }
    }

    private fun String.oneDigitNumberAndOneActionCalc(): Int {
        val num1 = this[0].toString().toInt()
        val num2 = this[2].toString().toInt()

        val action = this[1].toCalculatorAction()
        return action.calcByAction(num1, num2)
    }


    // bir necha xonali va 1ta amalli masala

    // 1xonali va ko'p amalli masala

    // ko'p xonali va ko'p amalli masala


    private fun String.isOneDigitNumberAndOneAction(): Boolean {
        return this[0].isDigit() &&
                this[2].isDigit() &&
                this[1].isCalculatorAction() &&
                this.length == 3
    }

    private fun CalculatorAction.calcByAction(num1: Int, num2: Int): Int {
        return when (this) {
            CalculatorAction.PLUS -> num1 + num2
            CalculatorAction.MINUS -> num1 - num2
            CalculatorAction.MULTIP -> num1 * num2
            CalculatorAction.DIVIDE -> num1 / num2
        }
    }
}