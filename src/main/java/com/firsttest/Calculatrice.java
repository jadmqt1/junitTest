package com.firsttest;

public class Calculatrice {

    // Méthode d'addition
    public double addition(double a, double b) {
        return a + b;
    }

    // Méthode de soustraction
    public double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode de multiplication
    public double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode de division
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro n'est pas permise.");
        }
        return a / b;
    }

    // Méthode principale pour tester la calculatrice
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("Addition : " + calc.addition(10, 5));
        System.out.println("Soustraction : " + calc.soustraction(10, 5));
        System.out.println("Multiplication : " + calc.multiplication(10, 5));
        System.out.println("Division : " + calc.division(10, 5));
    }
}
