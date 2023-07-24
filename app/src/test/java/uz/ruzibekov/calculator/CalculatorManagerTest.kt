package uz.ruzibekov.calculator

import org.junit.Test
import uz.ruzibekov.calculator.helper.CalculatorManager

class CalculatorManagerTest {

    private val func = CalculatorManager()



    @Test
    fun `add 2 one-digit numbers`() {
        assert(func.calculate("2+2") == 4)
    }

    @Test
    fun `subtraction between 2 one-digit numbers`() {
        assert(func.calculate("5-3") == 2)
    }

    @Test
    fun `multiplication between 2 one-digit numbers`() {
        assert(func.calculate("7*2") == 14)
    }

    @Test
    fun `dividing between 2 one-digit numbers`() {
        assert(func.calculate("8/2") == 4)
    }



    @Test
    fun `add 2 multi-digit numbers`() {
        assert(func.calculate("45+5") == 50)
    }

    @Test
    fun `subtraction between 2 multi-digit numbers`() {
        assert(func.calculate("347-22") == 325)
    }

    @Test
    fun `multiplication between 2 multi-digit numbers`() {
        assert(func.calculate("110*2") == 220)
    }

    @Test
    fun `dividing between 2 multi-digit numbers`() {
        assert(func.calculate("840/20") == 42)
    }
}