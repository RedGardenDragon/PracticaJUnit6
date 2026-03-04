package edu.sebastianManrique.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorPasswordTest {

    @Test
    void esValida_passwordCorrecta_deberiaDevolverTrue() {
        ValidadorPassword v = new ValidadorPassword();
        assertTrue(v.esValida("ClaveSegura1"));
    }

    @Test
    void esValida_passwordCorta_deberiaDevolverFalse() {
        ValidadorPassword v = new ValidadorPassword();
        assertFalse(v.esValida("Abc1"));
    }

    @Test
    void esValida_null_deberiaDevolverFalse() {
        ValidadorPassword v = new ValidadorPassword();
        assertFalse(v.esValida(null));
    }
}
