package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Vector;

public class BasicCalculator
{
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long rest(Long number1, Long number2) {
        logger.info( "resting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "multiplying {} * {}", number1, number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        validateIfDivisionIsBy0(number1,number2);
        return number1/number2;
    }

    public void validateIfDivisionIsBy0(double number1, double number2){
        if(number2 == 0){
            logger.error("Division by 0 does not exist");
        }
        else{
            logger.info("Dividing {} / {}", number1, number2);
        }
    }
}
