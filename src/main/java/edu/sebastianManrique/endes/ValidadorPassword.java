package edu.sebastianManrique.endes;

import java.util.regex.Pattern;

/**
 * Clase que valida contraseñas según reglas básicas.
 */
public class ValidadorPassword {

    private static final Pattern PATRON =
            Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");

    public boolean esValida(String password) {
        if (password == null) {
            return false;
        }
        return PATRON.matcher(password).matches();
    }
}

