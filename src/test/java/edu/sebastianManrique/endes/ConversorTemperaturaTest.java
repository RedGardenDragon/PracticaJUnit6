package edu.sebastianManrique.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @Test
    void celsiusAFahrenheit_deberiaConvertirCorrectamente() {
        ConversorTemperatura c = new ConversorTemperatura();
        assertEquals(32.0, c.celsiusAFahrenheit(0.0));
        assertEquals(212.0, c.celsiusAFahrenheit(100.0));
    }

    @Test
    void fahrenheitACelsius_deberiaConvertirCorrectamente() {
        ConversorTemperatura c = new ConversorTemperatura();
        assertEquals(0.0, c.fahrenheitACelsius(32.0), 0.0001);
        assertEquals(100.0, c.fahrenheitACelsius(212.0), 0.0001);
    }
}
