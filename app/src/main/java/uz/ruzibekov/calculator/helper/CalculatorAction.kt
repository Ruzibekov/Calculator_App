package uz.ruzibekov.calculator.helper

enum class CalculatorAction(private val action: Char) {
    PLUS('+'), MINUS('-'), MULTIP('*'), DIVIDE('/');

    fun getValue(): Char {
        return action
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