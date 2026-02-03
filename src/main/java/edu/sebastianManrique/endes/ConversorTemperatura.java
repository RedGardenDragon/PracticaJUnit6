package edu.sebastianManrique.endes;

/**
 * Clase que convierte temperaturas entre grados Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    public double celsiusAFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
