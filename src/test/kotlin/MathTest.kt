import org.junit.Assert
import org.junit.Test

class MathTest {

    @Test
    fun addTest() {
        val expected = 3
        val actual = Math().add(1, 2)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNumber1LessNumber2_minimumShouldBeNumber1() {
        //The case number1 less than number2
        val expected = Math().minimum(1,3)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNumber2LessNumber1_minimumShouldBeNumber2() {
        //The case number2 less than number1
        val expected = Math().minimum(3,1)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }
}