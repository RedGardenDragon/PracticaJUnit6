package edu.sebastianManrique.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculadoraTest {

    @Test
    void sumar_deberiaSumarCorrectamente() {
        calculadora calc = new calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void dividir_deberiaDividirCorrectamente() {
        calculadora calc = new calculadora();
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    void dividir_entreCero_deberiaLanzarIllegalArgumentException() {
        calculadora calc = new calculadora();
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(5, 0));
    }
}
