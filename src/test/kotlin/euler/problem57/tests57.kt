package euler.problem57

import org.junit.Test
import kotlin.test.assertEquals

class TestSource {
    @Test
    fun sevenNotEnough() {
        assertEquals(0, countExpansionsWithExtraNumeratorDigit(7))
    }

    @Test
    fun firstOneAtEight() {
        assertEquals(1, countExpansionsWithExtraNumeratorDigit(8))
    }

    @Test
    fun countForThousand() {
        assertEquals(153, countExpansionsWithExtraNumeratorDigit(1000))
    }
}
