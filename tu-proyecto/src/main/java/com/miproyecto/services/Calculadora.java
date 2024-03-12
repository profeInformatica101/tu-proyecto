package com.miproyecto.services;
/**
 * Interfaz Calculadora para definir operaciones matemáticas básicas.
 * Esta interfaz debería ser implementada por cualquier clase que ofrezca
 * operaciones aritméticas como sumar, restar, multiplicar y dividir.
 *
 * @author ENDES
 * @version 1.0
 */
public interface Calculadora {

    /**
     * Suma dos números.
     *
     * @param a El primer sumando.
     * @param b El segundo sumando.
     * @return La suma de a y b.
     */
    double sumar(double a, double b);

    /**
     * Resta dos números.
     *
     * @param a El minuendo.
     * @param b El sustraendo.
     * @return La diferencia de a y b.
     */
    double restar(double a, double b);

    /**
     * Multiplica dos números.
     *
     * @param a El primer factor.
     * @param b El segundo factor.
     * @return El producto de a y b.
     */
    double multiplicar(double a, double b);

    /**
     * Divide dos números.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de a y b.
     * @throws ArithmeticException si b es 0.
     */
    double dividir(double a, double b) throws ArithmeticException;
}