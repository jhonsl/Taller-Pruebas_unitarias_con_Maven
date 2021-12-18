package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class App
{
    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        Long suma = calculator.sum( number1, number2 );
        Long resta = calculator.rest( number1, number2 );
        Long multiplicacion = calculator.multiply( number1, number2 );
        double division = calculator.divide( number1, number2 );

        System.out.println("La suma es" + number1 + " + " + number2 + " = " + suma );
        System.out.println("La resta es" + number1 + " - " + number2 + " = " + resta );
        System.out.println("La multiplicacion es" + number1 + " x " + number2 + " = " + multiplicacion );
        System.out.println("La division es" + number1 + " / " + number2 + " = " + division );
    }
}
