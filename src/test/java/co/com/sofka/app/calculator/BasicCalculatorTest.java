package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest{

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing Several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,     1,      1",
            "1,     2,      3",
            "49,    51,     100",
            "1,     100,    101"
    })
    public void severalSums(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing rest: 8-4=4")
    public void rest(){
        //Arrange
        Long numero1 = 8L;
        Long numero2 = 4L;
        Long expectedValue = 4L;

        //Act
        Long result = basicCalculator.rest(numero1, numero2);

        //Assert
        assertEquals(result, expectedValue);
    }

    @DisplayName("Testing several retss")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "10,    5,      5",
            "88,    50,     38",
            "40,    -20,    60",
            "60,    1,      59"
    })
    public void severalRests(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.rest(first, second),
                () -> first + " - " + second + " = " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiply: 5*10=50")
    public void Multplication(){
        //Arrange
        Long numero1 = 5L;
        Long numero2 = 10L;
        Long expectedValue = 50L;

        //Act
        Long result = basicCalculator.multiply(numero1, numero2);

        //Assert
        assertEquals(result, expectedValue);
    }

    @DisplayName("Testing several multiplies")
    @ParameterizedTest(name = "{0} x {1} = {2}")
    @CsvSource({
            "8,     2,      16",
            "5,     5,      25",
            "9,     9,      81",
            "10,    10,     100"
    })
    public void severalMultiplies(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " x " + second + " = " + expectedResult);
    }

    @Test
    @DisplayName("Testing divide: 25/5=5")
    public void divide(){
        //Arrange
        Long numero1 = 25L;
        Long numero2 = 5L;
        double expectedValue = 5;

        //Act
        Object result = basicCalculator.divide(numero1, numero2);

        //Assert
        assertEquals(result, expectedValue);
    }

    @DisplayName("Testing several multiplies")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
        "100,       10,     10",
        "20,        5,      4",
        "10,        4,      2.5",
        "80,        0,      Infinity"
    })
    public void severalDivisions(Long first, Long second, double expectedResult){
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + " / " + second + " = " + expectedResult);
    }
}
