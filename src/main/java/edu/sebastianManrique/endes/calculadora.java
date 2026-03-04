package edu.sebastianManrique.endes;

/**
 * Clase que realiza operaciones aritméticas básicas.
 */
public class calculadora {

    /**
     * Suma dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta el segundo número al primero.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide el primer número entre el segundo.
     * @throws IllegalArgumentException si el divisor es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }
}
