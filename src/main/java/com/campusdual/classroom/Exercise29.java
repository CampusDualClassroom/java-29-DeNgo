package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new Exception("Excepción controlada en el método main");
        } catch (Exception e) {

            System.out.println("Excepción capturada: " + e.getMessage() + " \uD83E\uDD20");
        }
    }
}

