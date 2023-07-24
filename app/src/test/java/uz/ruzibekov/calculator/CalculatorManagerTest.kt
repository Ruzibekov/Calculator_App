package uz.ruzibekov.calculator

import org.junit.Test
import uz.ruzibekov.calculator.helper.CalculatorManager

class CalculatorManagerTest {
    private val func = CalculatorManager()

    @Test
    fun `add 2 numbers`() {
        assert(func.calculate("2+2") == 4)
    }

    @Test
    fun `subtraction between 2 numbers`() {
        assert(func.calculate("5-3") == 2)
    }

    @Test
    fun `multiplication between 2 numbers`() {
        assert(func.calculate("7*2") == 14)
    }

    @Test
    fun `dividing between 2 numbers`() {
        assert(func.calculate("8/2") == 4)
    }



}