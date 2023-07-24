package uz.ruzibekov.calculator.helper

import uz.ruzibekov.calculator.utils.Constants

enum class CalculatorAction(private val action: Char) {
    PLUS('+'), MINUS('-'), MULTIP('*'), DIVIDE('/');

    fun getValue(): Char {
        return action
    }

    fun calculate(num1: Int, num2: Int): Int {
        return when (this) {
            PLUS -> num1 + num2
            MINUS -> num1 - num2
            MULTIP -> num1 * num2
            DIVIDE -> num1 / num2
        }
    }
}

fun Char.toCalculatorAction(): CalculatorAction {
    return CalculatorAction.values().find { it.getValue() == this } ?: CalculatorAction.PLUS
}

fun Char.isCalculatorAction(): Boolean {
    return this == CalculatorAction.PLUS.getValue() ||
            this == CalculatorAction.MINUS.getValue() ||
            this == CalculatorAction.MULTIP.getValue() ||
            this == CalculatorAction.DIVIDE.getValue()
}

fun String.getExistingCalculatorAction(): CalculatorAction? {
    return CalculatorAction.values().find { this.indexOf(it.getValue()) != Constants.NONEXISTENT_INDEX }
}