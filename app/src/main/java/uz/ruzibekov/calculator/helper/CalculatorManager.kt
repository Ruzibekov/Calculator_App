package uz.ruzibekov.calculator.helper

class CalculatorManager {

    fun calculate(text: String): Int {
        return when {
            text.isOneDigitNumberAndOneAction() -> text.oneDigitNumberAndOneActionCalc()
            text.isMultipleDigitNumberAndOneAction() -> text.multipleDigitNumberAndOneActionCalc()
            else -> 0
        }
    }



    private fun String.oneDigitNumberAndOneActionCalc(): Int {
        val num1 = this[0].toString().toInt()
        val num2 = this[2].toString().toInt()

        val action = this[1].toCalculatorAction()

        return action.calculate(num1, num2)
    }

    private fun String.isOneDigitNumberAndOneAction(): Boolean {
        return this[0].isDigit() &&
                this[2].isDigit() &&
                this[1].isCalculatorAction() &&
                this.length == 3
    }



    private fun String.multipleDigitNumberAndOneActionCalc(): Int {
        this.getExistingCalculatorAction()?.let { calculatorAction ->
            val actionIndex = this.indexOf(calculatorAction.getValue())
            val num1 = this.substring(0, actionIndex).toInt()
            val num2 = this.substring(actionIndex + 1).toInt()
            return calculatorAction.calculate(num1, num2)
        }
        return 0
    }

    private fun String.isMultipleDigitNumberAndOneAction(): Boolean {
        this.getExistingCalculatorAction()?.let { action ->
            val actionIndex = this.indexOf(action.getValue())

            return this.substring(0, actionIndex).all { it.isDigit() } &&
                    this.substring(actionIndex + 1).all { it.isDigit() }
        }
        return false
    }

    // 1xonali va ko'p amalli masala

    // ko'p xonali va ko'p amalli masala


}